package it.poliba.sisinflab.ssn.sim;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.californium.core.network.config.NetworkConfig;

import it.poliba.sisinflab.ssn.GatewayServer;

public class MultiGWSim {
	
	private static String SERVER_ADDRESS = "192.168.2.16";
	private static int COAP_PORT = 5683;
	private static String CONFIG_FILE = "server-config-local2.json";
	private static String ONTOLOGY = "SensorOntology.owl";

	public static void main(String[] args) {
		
		NetworkConfig config = NetworkConfig.createStandardWithoutFile();	    	
    	config.setInt(NetworkConfig.Keys.ACK_TIMEOUT, 60000);

    	for(int i=0; i<100; i++) { 
    		// load reference ontology
        	InputStream in = MultiGWSim.class.getClassLoader().getResourceAsStream(ONTOLOGY);    	
        	// load config file specifying local and remote resources 
        	InputStream res = MultiGWSim.class.getClassLoader().getResourceAsStream(CONFIG_FILE);  
        	
	    	GatewayServer server;
			try {
				config.setInt(NetworkConfig.Keys.COAP_PORT, COAP_PORT + i);
				server = new GatewayServer(in, config, res);
		    	server.addEndpoint(SERVER_ADDRESS, COAP_PORT + i);        	
		    	server.add(server.new SimpleResource());
		        server.start();
			} catch (IOException e) {
				e.printStackTrace();
				System.err.println("Failed to initialize server " + i);
			}
    	}
    	
	}

}
