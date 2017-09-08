package it.poliba.sisinflab.coap.semantic;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.core.network.config.NetworkConfig;
import org.eclipse.californium.core.server.resources.Resource;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import it.poliba.sisinflab.coap.CustomMessageTracer;
import it.poliba.sisinflab.coap.DiscoveryUtils;
import it.poliba.sisinflab.coap.semantic.resources.SemanticCoapResource;
import it.poliba.sisinflab.coap.semantic.resources.SemanticDiscoveryResource;
import it.poliba.sisinflab.coap.semantic.resources.ServerRemoteResource;
import it.poliba.sisinflab.codec.OWLEncoder;
import it.poliba.sisinflab.codec.SDEncoder;
import it.poliba.sisinflab.owl.KBManager;

public class SemanticCoapServer extends CoapServer {
		
	SemanticDiscoveryResource sdr;
	KBManager mng;
	OWLEncoder enc;
	
	CoapClient client;
	
	public SemanticCoapServer(InputStream ontology, NetworkConfig config) {
		super(config);
		
		try {	
			byte[] data = IOUtils.toByteArray(ontology);
			
			enc = new SDEncoder(data);
			mng = new KBManager(new ByteArrayInputStream(data));
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(0);
		}
		
		// replace basic .well-known/core resource with Semantic-based discovery resource
		CoapResource wellKnown = (CoapResource) getRoot().getChild(".well-known");
		((CoapResource) wellKnown.getChild("core")).delete();
		
		sdr = new SemanticDiscoveryResource(getRoot(), mng, enc);
		wellKnown.add(sdr);
		
		client = new CoapClient();
		client.setTimeout(50000);		
		client.setEndpoint(new CoapEndpoint());		
		client.getEndpoint().addInterceptor(new CustomMessageTracer());	
	}
	
	public SemanticCoapServer(InputStream ontology, NetworkConfig config, InputStream resources) {		
		this(ontology, config);
		init(resources);					
	}
	
	private void init(InputStream resources) {		
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new InputStreamReader(resources));
			JSONObject root = (JSONObject) obj;
			
			// init local resources
			JSONArray localResources = (JSONArray) root.get("local");
			Iterator<JSONObject> iterator = localResources.iterator();
			while (iterator.hasNext()) {
				JSONObject sensor = iterator.next();
				SemanticCoapResource res = getLocalResource(sensor);
				if (res != null) {		        
					add(res);		        
					System.out.println("Resource <" + res.getName() + "> loaded!");
				}
			}
			
			// init remote resources
			JSONArray remoteResources = (JSONArray) root.get("remote");
			Iterator<String> itRemote = remoteResources.iterator();
			int sinkID = 1;
			while (itRemote.hasNext()) {
				String sinkAddress = itRemote.next();
				addRemoteResources(sinkAddress, getRoot(), sinkID);
				sinkID++;
			}	
						
			// init gateways list

			JSONArray gwResources = (JSONArray) root.get("gateway");
			Iterator<String> itGateways = gwResources.iterator();
			while (itGateways.hasNext()) {
				String gw = itGateways.next();
				sdr.addGateway(gw);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private void addRemoteResources(String sinkAddress, Resource root, int sinkID) {
		System.out.println("Querying Sink " + sinkAddress + " ...");
		long start = System.currentTimeMillis();
		
		//CoapClient client = new CoapClient(sinkAddress + "/.well-known/core");
		client.setURI(sinkAddress + "/.well-known/core");		
		CoapResponse resp = client.get();	
		long respTime = System.currentTimeMillis();
		
		if (resp != null) {
			Set<WebLink> resources = LinkFormat.parse(resp.getResponseText());
			for (WebLink r : resources) {
				if (r.getAttributes().containsAttribute(SemanticLinkFormat.SEMANTIC_DESCRIPTION)) {					
					String[] segments = r.getURI().split("/");
					String name = segments[segments.length-1];		
					
					ServerRemoteResource remres = new ServerRemoteResource(name, mng, enc, sinkAddress + r.getURI());
					DiscoveryUtils.copyAttributes(remres, r.getAttributes());
					
					Resource sink = root.getChild("S" + sinkID);
					if (sink == null) { 
						sink = new CoapResource("S" + sinkID);
						root.add(sink);
					}
					sink.add(remres);
					
					System.out.println("[OK]\t" + r.getURI() + "\t" + remres.getAttributes().getTitle());
				} else
					System.out.println("[SKIP]\t" + r.getURI());				
			}
		}
		
		long end = System.currentTimeMillis();
		System.out.println(">>> Discovery done on " + sinkAddress + " in " + (respTime-start) + " ms!");
		System.out.println(">>> Response processing done on " + sinkAddress + " in " + (end-respTime) + " ms!");
	}
	
	private SemanticCoapResource getLocalResource(JSONObject sensor) {
		String name = (String) sensor.get("id");
		long ct = (Long) sensor.get(LinkFormat.CONTENT_TYPE);
		String ro = (String) sensor.get(SemanticLinkFormat.REFERENCE_ONTOLOGY);
		String rt = (String) sensor.get(LinkFormat.RESOURCE_TYPE);
		double lat = (double) sensor.get(SemanticLinkFormat.LATITUDE);
		double lon = (double) sensor.get(SemanticLinkFormat.LONGITUDE);
		String sd = (String) sensor.get(SemanticLinkFormat.SEMANTIC_DESCRIPTION);
		
		SemanticCoapResource res = new SemanticCoapResource(name, mng, enc);
		res.getAttributes().addContentType((int) ct);
        res.getAttributes().addResourceType(rt);
		res.setReferenceOntology(ro);
        res.setLocation(lat, lon);
        
        InputStream inOWL = SemanticCoapServer.class.getClassLoader().getResourceAsStream(sd);
        String owl;
		try {
			owl = IOUtils.toString(inOWL, Charset.defaultCharset());
			inOWL.close();
	        res.setSemanticDescription(owl); 
	        
	        return res;
		} catch (IOException e) {
			e.printStackTrace();
		}
        
		return null;
	}

	public KBManager getKBManager() {
		return mng;
	}	
	
	public OWLEncoder getOWLEncoder() {
		return enc;
	}

}
