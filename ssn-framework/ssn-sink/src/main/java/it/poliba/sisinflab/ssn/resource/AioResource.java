package it.poliba.sisinflab.ssn.resource;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.server.resources.CoapExchange;

import mraa.Aio;

public class AioResource extends CoapResource {	
	
	Aio aio;

	public AioResource(String name, int pin) {
		super(name);
		aio = new Aio(pin);
	}
	
	@Override
    public void handleGET(CoapExchange exchange) {	
        exchange.respond(ResponseCode.CONTENT, String.valueOf(aio.read()), MediaTypeRegistry.TEXT_PLAIN);
	}

}
