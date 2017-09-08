package it.poliba.sisinflab.ssn;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.util.Iterator;

import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.network.CoapEndpoint;
import org.eclipse.californium.core.network.config.NetworkConfig;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;
import it.poliba.sisinflab.ssn.resource.AioResource;
import it.poliba.sisinflab.ssn.resource.GpioResource;

public class SinkServer extends CoapServer {
	
	private static String SERVER_ADDRESS = "192.168.2.18";
	private static int COAP_PORT = 5683;
	private static String CONFIG_FILE = "sink-config.json";	

	public static void main(String[] args) {
		
	    try {
	        System.loadLibrary("mraajava");
	    } catch (UnsatisfiedLinkError e) {
	        System.err.println("Native code library failed to load. See the chapter on Dynamic Linking Problems in the SWIG Java documentation for help.\n" + e);
	        System.exit(0);
	    }
	    
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
    	
    	// load config file specifying local and remote resources 
    	InputStream configRes = SinkServer.class.getClassLoader().getResourceAsStream(CONFIG_FILE);
		
		SinkServer sink = new SinkServer(config, configRes);
		sink.addEndpoint(SERVER_ADDRESS);
    	
    	// start sink
        sink.start();
	}
	
	public SinkServer(NetworkConfig configNet, InputStream configRes) {
		super(configNet);
		init(configRes);
	}
	
	private void init(InputStream resources) {		
		JSONParser parser = new JSONParser();
		try {
			Object obj = parser.parse(new InputStreamReader(resources));
			JSONObject root = (JSONObject) obj;
			
			// init sensor resources
			JSONArray sensors = (JSONArray) root.get("sensors");
			Iterator<JSONObject> it_sens = sensors.iterator();
			while (it_sens.hasNext()) {
				JSONObject sensor = it_sens.next();
				AioResource res = getAioResource(sensor);
				if (res != null) {		        
					add(res);		        
					System.out.println("Resource <" + res.getName() + "> loaded!");
				}
			}
			
			// init actuator resources
			JSONArray actuators = (JSONArray) root.get("actuators");
			Iterator<JSONObject> it_act = actuators.iterator();
			while (it_act.hasNext()) {
				JSONObject act = it_act.next();
				GpioResource res = getGpioResource(act);
				if (res != null) {		        
					add(res);		        
					System.out.println("Resource <" + res.getName() + "> loaded!");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}		
	}
	
	private AioResource getAioResource(JSONObject sensor) {
		String name = (String) sensor.get("id");
		long ct = (Long) sensor.get(LinkFormat.CONTENT_TYPE);
		String rt = (String) sensor.get(LinkFormat.RESOURCE_TYPE);
		double lat = (double) sensor.get(SemanticLinkFormat.LATITUDE);
		double lon = (double) sensor.get(SemanticLinkFormat.LONGITUDE);
		String sd = (String) sensor.get(SemanticLinkFormat.SEMANTIC_DESCRIPTION);
		long pin = (Long) sensor.get("pin");
		
		AioResource res = new AioResource(name, (int) pin);
		res.getAttributes().addContentType((int) ct);
        res.getAttributes().addResourceType(rt);
        res.getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_DESCRIPTION, String.valueOf(sd));
        res.getAttributes().setAttribute(SemanticLinkFormat.LATITUDE, String.valueOf(lat));
        res.getAttributes().setAttribute(SemanticLinkFormat.LONGITUDE, String.valueOf(lon));

		return res;
	}
	
	private GpioResource getGpioResource(JSONObject sensor) {
		String name = (String) sensor.get("id");
		long ct = (Long) sensor.get(LinkFormat.CONTENT_TYPE);
		String rt = (String) sensor.get(LinkFormat.RESOURCE_TYPE);
		double lat = (double) sensor.get(SemanticLinkFormat.LATITUDE);
		double lon = (double) sensor.get(SemanticLinkFormat.LONGITUDE);
		String sd = (String) sensor.get(SemanticLinkFormat.SEMANTIC_DESCRIPTION);
		long pin = (Long) sensor.get("pin");
		
		GpioResource res = new GpioResource(name, (int) pin);
		res.getAttributes().addContentType((int) ct);
        res.getAttributes().addResourceType(rt);
        res.getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_DESCRIPTION, String.valueOf(sd));
        res.getAttributes().setAttribute(SemanticLinkFormat.LATITUDE, String.valueOf(lat));
        res.getAttributes().setAttribute(SemanticLinkFormat.LONGITUDE, String.valueOf(lon));

		return res;
	}
	
	private void addEndpoint(String addr) {
    	InetSocketAddress bindToAddress = new InetSocketAddress(addr, COAP_PORT);
		addEndpoint(new CoapEndpoint(bindToAddress));
    }

}
