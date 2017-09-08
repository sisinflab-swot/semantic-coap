package it.poliba.sisinflab.coap.semantic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;

import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.server.resources.Resource;
import org.semanticweb.owlapi.model.IRI;

import it.poliba.sisinflab.coap.DiscoveryUtils;
import it.poliba.sisinflab.coap.semantic.resources.SemanticCoapResource;
import it.poliba.sisinflab.owl.sod.hlds.Item;

public class SemanticLinkFormat {
	
	// for Semantic-based Resource Discovery
	public static final String REFERENCE_ONTOLOGY    = "ro";
	public static final String SEMANTIC_DESCRIPTION  = "sd";
	public static final String ANNOTATION_TYPE       = "at";
	public static final String SEMANTIC_TASK         = "st";
	public static final String SEMANTIC_THRESHOLD    = "sr";
	public static final String LATITUDE         	 = "lat";
	public static final String LONGITUDE         	 = "lon";
	public static final String MAX_DISTANCE        	 = "md";
	public static final String CURRENT_HOP        	 = "hop";
	
	public static final String RANKING_TASK          = "1";
	public static final String COVERING_TASK         = "2";
	
	
	public static String rankTree(Resource resource, IRI req, HashMap<String, String> semQueries) {
		StringBuilder buffer = new StringBuilder();
		List<String> noQueries = Collections.emptyList();
		
		// only include children, not the entry point itself
		for (Resource child:resource.getChildren()) {
			rankTree(child, req, semQueries, noQueries, buffer);
		}
		
		if (buffer.length()>1)
			buffer.delete(buffer.length()-1, buffer.length());
		return buffer.toString();
	}

	public static void rankTree(Resource resource, IRI req, HashMap<String, String> semQueries, List<String> queries, StringBuilder buffer) {
		// add the current resource to the buffer
		if (resource.isVisible()
				&& LinkFormat.matches(resource, queries)) {
			
			if (resource instanceof SemanticCoapResource) {
				
				// clear old values
				resource.getAttributes().clearAttribute(MAX_DISTANCE);
				resource.getAttributes().clearAttribute(SEMANTIC_THRESHOLD);
				
				/*** Distance-based filtering ***/
				double md = DiscoveryUtils.getDoubleValue(semQueries, MAX_DISTANCE);
				double lat = DiscoveryUtils.getDoubleValue(semQueries, LATITUDE);
				double lon = DiscoveryUtils.getDoubleValue(semQueries, LONGITUDE);
				
				if (md != -1 && lat != -1 && lon != -1) {					
					double dist = ((SemanticCoapResource) resource).getDistanceFrom(lat, lon);	
					resource.getAttributes().setAttribute(MAX_DISTANCE, String.valueOf(dist));
					
					if (dist > md)						
						return;					
				} 
				
				/*** Semantic-based filtering ***/
				
				double sr = DiscoveryUtils.getDoubleValue(semQueries, SEMANTIC_THRESHOLD);
				if (sr != -1) {
					double rank = ((SemanticCoapResource) resource).getSemanticRank(req) * 100;
					resource.getAttributes().setAttribute(SEMANTIC_THRESHOLD, String.valueOf(rank));
					
					if (rank < sr) {
						return;
					}
				}	
				
				buffer.append(LinkFormat.serializeResource(resource));
			} 			
		}
		
		// sort by resource name
		List<Resource> childs = new ArrayList<Resource>(resource.getChildren());
		Collections.sort(childs, new Comparator<Resource>() {
		    @Override
		    public int compare(Resource o1, Resource o2) {
		        return o1.getName().compareTo(o2.getName());
		    }
		});
		
		for (Resource child:childs) {
			rankTree(child, req, semQueries, queries, buffer);
		}
	}
	
	public static ArrayList<IRI> filterByDistance(Resource root, HashMap<String, String> semQueries, List<String> queries) {
		ArrayList<IRI> list = new ArrayList<IRI>();
		
		/*** Distance-based filtering ***/
		double md = DiscoveryUtils.getDoubleValue(semQueries, MAX_DISTANCE);
		double lat = DiscoveryUtils.getDoubleValue(semQueries, LATITUDE);
		double lon = DiscoveryUtils.getDoubleValue(semQueries, LONGITUDE);
		
		if (md != -1 && lat != -1 && lon != -1) {	
			filterByDistance(root, list, queries, md, lat, lon);					
		}
		
		return list;
	}
	
	private static void filterByDistance(Resource root, ArrayList<IRI> list, List<String> queries, double md, double lat, double lon) {
		for (Resource child : root.getChildren()) {
			if (child instanceof SemanticCoapResource) {
				double dist = ((SemanticCoapResource) child).getDistanceFrom(lat, lon);					
				if (dist <= md && LinkFormat.matches(child, queries)) {
					child.getAttributes().setAttribute(MAX_DISTANCE, String.valueOf(dist));
					list.add(((SemanticCoapResource) child).getIRI());										
				}
			}
			
			filterByDistance(child, list, queries, md, lat, lon);
		}	
	}
	
	public static void selectResources(Resource resource, Vector<Item> selected, StringBuilder buffer) {
		if (resource instanceof SemanticCoapResource) {
			IRI iri = ((SemanticCoapResource) resource).getIRI();
			if (isSelected(iri, selected))
				buffer.append(LinkFormat.serializeResource(resource));				
		}
		
		for (Resource child : resource.getChildren()) 
			selectResources(child, selected, buffer);
	}
	
	private static boolean isSelected(IRI iri, Vector<Item> selected) {
		for (Item i : selected) {
			if (i.name.toString().equals(iri.toString())) {
				return true;
			}					
		}
		return false;
	}

}
