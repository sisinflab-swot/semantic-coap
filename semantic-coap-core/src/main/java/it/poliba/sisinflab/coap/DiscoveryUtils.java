package it.poliba.sisinflab.coap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.server.resources.Resource;
import org.eclipse.californium.core.server.resources.ResourceAttributes;

import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;
import it.poliba.sisinflab.coap.semantic.resources.SemanticCoapResource;

public class DiscoveryUtils {
	
	/**
	 * Calculate distance between two points in latitude and longitude taking
	 * into account height difference. If you are not interested in height
	 * difference pass 0.0. Uses Haversine method as its base.
	 * 
	 * lat1, lon1 Start point lat2, lon2 End point el1 Start altitude in meters
	 * el2 End altitude in meters
	 * @returns Distance in Meters
	 */
	public static double distance(double lat1, double lat2, double lon1,
	        double lon2, double el1, double el2) {

	    final int R = 6371; // Radius of the earth

	    double latDistance = Math.toRadians(lat2 - lat1);
	    double lonDistance = Math.toRadians(lon2 - lon1);
	    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
	            + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2))
	            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
	    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
	    double distance = R * c * 1000; // convert to meters

	    double height = el1 - el2;

	    distance = Math.pow(distance, 2) + Math.pow(height, 2);

	    return Math.sqrt(distance);
	}
	
	public static double getDoubleValue(HashMap<String, String> map, String k) {
		if (map.containsKey(k)) 
			return Double.parseDouble(map.get(k));
		else
			return -1;
	}
	
	public static double getDoubleValue(HashMap<String, String> map, String k, double default_value) {
		if (map.containsKey(k)) 
			return Double.parseDouble(map.get(k));
		else
			return default_value;
	}
	
	public static int getIntValue(HashMap<String, String> map, String k) {
		if (map.containsKey(k)) 
			return Integer.parseInt(map.get(k));
		else
			return -1;
	}
	
	public static String getStringValue(HashMap<String, String> map, String k) {
		if (map.containsKey(k)) 
			return map.get(k);
		else
			return null;
	}
	
	public static List<String> splitByFixedSize(String text, int n) {
		List<String> list= new ArrayList<String>();
		int index = 0;
		while (index<text.length()) {
		    list.add(text.substring(index, Math.min(index + n, text.length())));
		    index=index + n;
		}
		return list;
	}
	
	public static Resource buildResource(String name, ResourceAttributes attr) {
		CoapResource r = new CoapResource(name);
		for (String key : attr.getAttributeKeySet()) {
			for (String value : attr.getAttributeValues(key)) {
				r.getAttributes().addAttribute(key, value);
			}
		}
		return r;
	}

	public static void copyAttributes(SemanticCoapResource res, ResourceAttributes attr) {
		for (String ct : attr.getContentTypes())
			res.getAttributes().addContentType(Integer.valueOf(ct));
		
		for (String rt : attr.getResourceTypes())
			res.getAttributes().addResourceType(rt);
		
		if (attr.containsAttribute(SemanticLinkFormat.ANNOTATION_TYPE))
			res.setAnnotationType(Integer.parseInt(attr.getAttributeValues(SemanticLinkFormat.ANNOTATION_TYPE).get(0)));
		
		//res.getAttributes().setTitle(attr.getTitle());
		//res.setReferenceOntology(attr.getAttributeValues(SemanticLinkFormat.REFERENCE_ONTOLOGY).get(0));
		
		double lat = Double.parseDouble(attr.getAttributeValues(SemanticLinkFormat.LATITUDE).get(0));
		double lon = Double.parseDouble(attr.getAttributeValues(SemanticLinkFormat.LONGITUDE).get(0));
		res.setLocation(lat, lon);
		
		res.setEncodedSemanticDescription(attr.getAttributeValues(SemanticLinkFormat.SEMANTIC_DESCRIPTION).get(0));		
	}
	
	public static String buildUriQuery(HashMap<String, String> semQueries, String sd) {
		String query = "?";
		for (String k : semQueries.keySet()) {
			if (k.equalsIgnoreCase(SemanticLinkFormat.SEMANTIC_DESCRIPTION)) {
				if (sd.length() <= 250)
					query = query + "sd=" + sd + "&";
				else {
					List<String> splitted = DiscoveryUtils.splitByFixedSize(sd, 250);
					for (String s : splitted) {
						query = query + "sd=" + s + "&";
					}
				}
			}
			else
				query = query + k + "=" + semQueries.get(k) + "&";
		}
		return query.substring(0, query.length()-1);
	}

}
