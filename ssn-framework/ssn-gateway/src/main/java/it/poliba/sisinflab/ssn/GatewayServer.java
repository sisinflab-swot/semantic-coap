package it.poliba.sisinflab.ssn;

import java.io.IOException;
import java.io.InputStream;
import java.net.InetSocketAddress;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.core.network.config.NetworkConfig;
import org.eclipse.californium.core.server.resources.CoapExchange;

import it.poliba.sisinflab.coap.semantic.SemanticCoapServer;

public class GatewayServer extends SemanticCoapServer {

	private static String SERVER_ADDRESS = "127.0.0.1";
	private static int COAP_PORT = 5683;
	private static String CONFIG_FILE = "server-config.json";
	private static String ONTOLOGY = "SensorOntology.owl";
    
    public static void main(String[] args) {
	    try { 
	    	
	    	NetworkConfig config = NetworkConfig.createStandardWithoutFile();	    	
	    	config.setInt(NetworkConfig.Keys.ACK_TIMEOUT, 60000);
	    	config.setInt(NetworkConfig.Keys.PREFERRED_BLOCK_SIZE, 2048);
	    	
	    	// read command line parameters
	    	if (args.length == 3) {   
	    		SERVER_ADDRESS = args[0];
	    		COAP_PORT = Integer.parseInt(args[1]);
	    		config.setInt(NetworkConfig.Keys.COAP_PORT, COAP_PORT);
	    		CONFIG_FILE = args[2];    		            	
	    	} else
	    		System.err.println("Failed to load server parameters. Starting server with default config!");
	    	
	    	// load reference ontology
	    	InputStream in = GatewayServer.class.getClassLoader().getResourceAsStream(ONTOLOGY);
	    	
	    	// load config file specifying local and remote resources 
	    	InputStream res = GatewayServer.class.getClassLoader().getResourceAsStream(CONFIG_FILE);    	
	    	
	        // create server
	    	GatewayServer server = new GatewayServer(in, config, res);
	    	
	    	// add endpoint on the specified IP address 
	    	server.addEndpoint(SERVER_ADDRESS, COAP_PORT);   
	        
	        // start server
	    	server.add(server.new SimpleResource());
	        server.start();
	
	    } catch (IOException e) {
	        System.err.println("Failed to initialize server: " + e.getMessage());
	    }
    }
    
    public void addEndpoint(String addr, int port) {
    	InetSocketAddress bindToAddress = new InetSocketAddress(addr, port);
		addEndpoint(new CoapEndpoint(bindToAddress));
    }

    /*
     * Constructor for a new Semantic-enhanced server.
     */
    public GatewayServer(InputStream onto, NetworkConfig config, InputStream resources) throws IOException {
    	super(onto, config, resources);        
    }

    /*
     * Definition of a simple CoAP resource
     */
   public class SimpleResource extends CoapResource {
        
        public SimpleResource() {
            
            // set resource identifier
            super("simple");
            
            // set display name
            getAttributes().setTitle("SimpleResource");
        }

        @Override
        public void handleGET(CoapExchange exchange) {
            
            // respond to the request
            exchange.respond("I'm a simple CoAP resource!");
        }
    }
}
