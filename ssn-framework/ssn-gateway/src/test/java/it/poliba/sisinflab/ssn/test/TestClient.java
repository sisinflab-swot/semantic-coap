package it.poliba.sisinflab.ssn.test;

import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Set;

import org.apache.commons.io.IOUtils;
import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.network.CoapEndpoint;

import it.poliba.sisinflab.coap.DiscoveryUtils;
import it.poliba.sisinflab.coap.CustomMessageTracer;
import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;
import it.poliba.sisinflab.codec.SDEncoder;
import it.poliba.sisinflab.ssn.GatewayServer;

public class TestClient {
	
	private static String ONTOLOGY = "SensorOntology.owl";
	private static String REQUEST = "requests/demand_covering.owl";
	

	public static void main(String[] args) throws Exception {
		
		InputStream in = GatewayServer.class.getClassLoader().getResourceAsStream(ONTOLOGY);
		SDEncoder enc = new SDEncoder(IOUtils.toByteArray(in));
		
		HashMap<String, String> semQueries = new HashMap<String, String>();
		semQueries.put(SemanticLinkFormat.SEMANTIC_TASK, SemanticLinkFormat.COVERING_TASK);
		semQueries.put(SemanticLinkFormat.SEMANTIC_THRESHOLD, "100");
		semQueries.put(SemanticLinkFormat.CURRENT_HOP, "0");
		semQueries.put(SemanticLinkFormat.MAX_DISTANCE, "20000");
		semQueries.put(SemanticLinkFormat.LATITUDE, "41.1550976");
		semQueries.put(SemanticLinkFormat.LONGITUDE, "16.7371046");
		semQueries.put(SemanticLinkFormat.SEMANTIC_DESCRIPTION, "");
		
		InputStream req = GatewayServer.class.getClassLoader().getResourceAsStream(REQUEST);
		String owl = IOUtils.toString(req, Charset.defaultCharset());
		String sd = enc.encodeOWL(owl);
		
		String query = DiscoveryUtils.buildUriQuery(semQueries, sd);

		CoapClient client = new CoapClient();
		client.setTimeout(50000);
		
		client.setEndpoint(new CoapEndpoint());		
		client.getEndpoint().addInterceptor(new CustomMessageTracer());
		
		client.setURI("coap://192.168.2.138:5683/.well-known/core" + query);
		
		long start = System.currentTimeMillis();
		CoapResponse resp = client.get();	
		long end = System.currentTimeMillis();
		
		System.out.println(">>> Response received in " + (end - start) + "\n" + resp.getResponseText());
		
		Set<WebLink> resources = LinkFormat.parse(resp.getResponseText());
		for (WebLink r : resources) {
			System.out.println(r.getURI());
		}
	}

}
