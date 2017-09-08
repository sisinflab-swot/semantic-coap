package it.poliba.sisinflab.coap.semantic.resources;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.server.resources.CoapExchange;
import org.eclipse.californium.core.server.resources.DiscoveryResource;
import org.eclipse.californium.core.server.resources.Resource;
import org.semanticweb.owlapi.model.IRI;

import it.poliba.sisinflab.coap.DiscoveryUtils;
import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;
import it.poliba.sisinflab.codec.OWLEncoder;
import it.poliba.sisinflab.owl.KBManager;
import it.poliba.sisinflab.owl.sod.hlds.Composition;
import it.poliba.sisinflab.owl.sod.hlds.Item;

public class SemanticDiscoveryResource extends DiscoveryResource {

	private final int MAX_HOP_COVERING = 2;
	
	private ArrayList<String> gwList;
	private Resource rootResource;
	private KBManager mng;
	private OWLEncoder encoder; 
	
	private HashMap<String,String> history;

	public SemanticDiscoveryResource(Resource root, KBManager mng, OWLEncoder enc) {
		super(root);
		this.rootResource = root;
		this.mng = mng;
		this.encoder = enc;
		gwList = new ArrayList<String>();
		history = new HashMap<String, String>();
	}
	
	/**
	 * Responds with a list of all resources of the server, i.e. links.
	 * 
	 * @param exchange the exchange
	 */
	@Override
	public void handleGET(CoapExchange exchange) {
		List<String> queries = exchange.getRequestOptions().getUriQuery();
		HashMap<String, String> semQueries = getSemanticUriQuery(queries);
		
		String tree = "";
		if (!semQueries.containsKey(SemanticLinkFormat.SEMANTIC_TASK))
			tree = discoverTree(rootResource, queries);
		else if (semQueries.get(SemanticLinkFormat.SEMANTIC_TASK).equals(SemanticLinkFormat.RANKING_TASK))
			tree = semanticDiscovery(rootResource, semQueries, queries);
		else if (semQueries.get(SemanticLinkFormat.SEMANTIC_TASK).equals(SemanticLinkFormat.COVERING_TASK)) {
			long start = System.currentTimeMillis();
			tree = semanticCovering(rootResource, semQueries, queries, exchange);
			long end = System.currentTimeMillis();
			System.out.println(">>> Semantic Discovery performed in " + (end - start) + " ms");
		}
		else
			tree = discoverTree(rootResource, queries);
		
		exchange.respond(ResponseCode.CONTENT, tree, MediaTypeRegistry.APPLICATION_LINK_FORMAT);
	}	
	
	public void addGateway(String gw) {
		gwList.add(gw);
	}

	public String semanticDiscovery(Resource root, HashMap<String, String> semQueries, List<String> queries) {
		String sd = DiscoveryUtils.getStringValue(semQueries, SemanticLinkFormat.SEMANTIC_DESCRIPTION);
		if (sd != null) {
			try {
				String owl = encoder.decodeOWL(sd);				
				IRI req = mng.loadRequestFromString(owl, true);				

				StringBuilder buffer = new StringBuilder();
				for (Resource child:root.getChildren()) {
					SemanticLinkFormat.rankTree(child, req, semQueries, queries, buffer);
				}
				
				// remove last comma ',' of the buffer
				if (buffer.length()>1)
					buffer.delete(buffer.length()-1, buffer.length());
				
				return buffer.toString();
			} catch (Exception e) {				
				e.printStackTrace();
				return "";
			}
		} else
			return discoverTree(root, queries);		
	}
	
	public String semanticCovering(Resource root, HashMap<String, String> semQueries, List<String> queries, CoapExchange exchange) {			
		String sd = DiscoveryUtils.getStringValue(semQueries, SemanticLinkFormat.SEMANTIC_DESCRIPTION);
		int hop = DiscoveryUtils.getIntValue(semQueries, SemanticLinkFormat.CURRENT_HOP);
		if (sd != null && hop <= MAX_HOP_COVERING) {
			try {			
				ArrayList<IRI> list = SemanticLinkFormat.filterByDistance(root, semQueries, queries);
				
				long start = System.currentTimeMillis();
				String owl = encoder.decodeOWL(sd);						
				IRI req = null;
				if (hop > 0)
					req = mng.loadRequestFromString(owl, false);
				else 
					req = mng.loadRequestFromString(owl, true);
				
				String reqID = exchange.getSourceAddress() +":" + exchange.getSourcePort() + "-" + req.toString();
				if (history.keySet().contains(reqID)) {
					System.out.println("[SKIPPED] OWL request already received! " + req.toString() + " [" + sd.length() + " B]");
					return history.get(reqID);
				} else 
					System.out.println("Received OWL request: " + req.toString() + " [" + sd.length() + " B]");
					
				System.out.println(">>> Request loaded in " + (System.currentTimeMillis() - start) + " ms!");
				
				start = System.currentTimeMillis();
				Composition comp = mng.getReasoner().composition(req, list);
				System.out.println(">>> Covering performed in " + (System.currentTimeMillis() - start) + " ms!");
				
				start = System.currentTimeMillis();
				StringBuilder buffer = new StringBuilder();
				SemanticLinkFormat.selectResources(root, comp.Rc, buffer);
				
				Resource unc = getUncoveredResource(comp.Du, req, reqID);				
				if (unc != null && hop != -1 && hop < MAX_HOP_COVERING) {	
					double sr = DiscoveryUtils.getDoubleValue(semQueries, SemanticLinkFormat.SEMANTIC_THRESHOLD, 100);
					semQueries.put(SemanticLinkFormat.CURRENT_HOP, String.valueOf(hop+1));												
					
					int gwIndex = 0;
					while (unc != null && gwIndex < gwList.size()) {
						double covered_value = 100 - Double.parseDouble(unc.getAttributes().getAttributeValues(SemanticLinkFormat.SEMANTIC_THRESHOLD).get(0))*100;
						if (covered_value < sr) 						
							unc = forwardRequest(gwList.get(gwIndex), unc, semQueries, buffer);
						else
							break;
						
						gwIndex++;
					}	
					
					if (unc != null) {
						String unc_owl = encoder.decodeOWL(unc.getAttributes().getAttributeValues(SemanticLinkFormat.SEMANTIC_DESCRIPTION).get(0));	
						IRI uncIRI = mng.loadIndividualFromString(unc_owl);
						double rank = mng.getSemanticRank(uncIRI, req);
						unc.getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_THRESHOLD, String.valueOf(rank));
					}
				}
				
				if (unc != null) 
					buffer.append(LinkFormat.serializeResource(unc));	
				
				// remove last comma ',' of the buffer
				if (buffer.length()>1)
					buffer.delete(buffer.length()-1, buffer.length());	
				
				System.out.println(">>> Request built in " + (System.currentTimeMillis() - start) + " ms!");
				
				history.put(reqID, buffer.toString());				
				return buffer.toString();
			} catch (Exception e) {				
				e.printStackTrace();
				return "";
			}
		} else
			return discoverTree(root, queries);	
	}
	
	private Resource forwardRequest(String gw, Resource unc, HashMap<String, String> semQueries, StringBuilder buffer) {	
		Resource resUnc = unc;		
		String sd = unc.getAttributes().getAttributeValues(SemanticLinkFormat.SEMANTIC_DESCRIPTION).get(0);
		String query = DiscoveryUtils.buildUriQuery(semQueries, sd);
		
		System.out.println("Forwarding to " + gw + " ... [" + sd.length() + " B]");
		CoapClient client = new CoapClient(gw + "/.well-known/core" + query);
		
		long start = System.currentTimeMillis();
		CoapResponse resp = client.get();	
		long stop = System.currentTimeMillis();
		System.out.println("Forwarding time: " + (stop-start) + " ms");
		
		if (resp != null && resp.getCode().compareTo(ResponseCode.CONTENT)==0) {
			String respText = resp.getResponseText(); 			
			Set<WebLink> remoteRes = LinkFormat.parse(respText);
			for (WebLink r : remoteRes) {					
				if (r.getURI().toLowerCase().endsWith("/h")) {
					resUnc = DiscoveryUtils.buildResource(r.getURI(), r.getAttributes());
				} else {
					Resource res = DiscoveryUtils.buildResource(gw + r.getURI(), r.getAttributes());
					buffer.append(LinkFormat.serializeResource(res));
				}
			}			
			System.out.println("Response from " + gw + " [" + respText.length() + " B]\n" + respText);
		}
	
		return resUnc;
	}

	private Resource getUncoveredResource(Item du, IRI req, String reqID) {	
		double uncovered = mng.getSemanticRank(du, req);			
		if (uncovered > 0) {		
			try {			
				String owl = mng.generateOWL(reqID, du.description);
				//System.out.println("Uncovered OWL: " + owl);
				String enc = encoder.encodeOWL(owl);
				
				CoapResource res = new CoapResource("/H");
				res.getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_DESCRIPTION, enc);
				res.getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_THRESHOLD, String.valueOf(uncovered));
				return res;
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
			
		return null;
	}

	private HashMap<String, String> getSemanticUriQuery(List<String> queries) {
		HashMap<String, String> params = new HashMap<String, String>();
		for (int i=0; i<queries.size(); i++) {
			String q = queries.get(i);
			String[] values = q.split("=");
			
			switch(values[0]) {				
				case SemanticLinkFormat.SEMANTIC_TASK:
				case SemanticLinkFormat.SEMANTIC_THRESHOLD:
				case SemanticLinkFormat.ANNOTATION_TYPE:
				case SemanticLinkFormat.LATITUDE:
				case SemanticLinkFormat.LONGITUDE:
				case SemanticLinkFormat.MAX_DISTANCE:
				case SemanticLinkFormat.CURRENT_HOP:
					params.put(values[0], values[1]);
					queries.remove(i);
					i--;
					break;
				
				case SemanticLinkFormat.SEMANTIC_DESCRIPTION:
					String tmp = "";
					if (params.containsKey(values[0]))
						tmp = params.get(values[0]);
					
					String sd = q.substring(3, q.length());										
					params.put(values[0], tmp + sd);
					
					queries.remove(i);
					i--;
					break;
			}
		}
		
		return params;
	}		

}
