package it.poliba.sisinflab.coap.semantic.resources;

import java.net.URI;
import java.net.URISyntaxException;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;

import it.poliba.sisinflab.codec.OWLEncoder;
import it.poliba.sisinflab.owl.KBManager;

public class ServerRemoteResource extends SemanticCoapResource {	
	
	String remoteAddress;
	
	public ServerRemoteResource(String name, KBManager mng, OWLEncoder enc, String remoteAddress) {
		super(name, mng, enc);
		this.remoteAddress = remoteAddress;
	}
	
	@Override
	protected void init() {
		add(new RemoteDataResource());
	}
	
	class RemoteDataResource extends CoapResource {

		public RemoteDataResource() {
			super("data");
		}
		
		@Override
	    public void handleGET(CoapExchange exchange) {		
			URI uri;
			try {
				uri = new URI(remoteAddress);
				CoapClient client = new CoapClient(uri);
				CoapResponse response = client.get();	
				if (response != null)
					exchange.respond(response.getCode(), response.getPayload(), response.getOptions().getContentFormat());
				else
					exchange.respond(ResponseCode.SERVICE_UNAVAILABLE);
			} catch (URISyntaxException e) {
				e.printStackTrace();
			}		
		}
		
	}

}
