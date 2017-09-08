package it.poliba.sisinflab.ssn.resource;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;

import mraa.Gpio;

public class GpioResource extends CoapResource {
	
	Gpio gpio;

	public GpioResource(String name, int pin) {
		super(name);
		gpio = new Gpio(pin);
	}
	
	@Override
    public void handleGET(CoapExchange exchange) {	
        exchange.respond(ResponseCode.CONTENT, String.valueOf(gpio.read()), MediaTypeRegistry.TEXT_PLAIN);
	}
	
	@Override
    public void handlePUT(CoapExchange exchange) {			
    	try {
    		int value = Integer.parseInt(exchange.getRequestText());
    		if (value == 0 || value == 1) {
    			gpio.write(value);
    			exchange.respond(ResponseCode.CHANGED);
    		} else
    			exchange.respond(ResponseCode.BAD_REQUEST);
    	} catch (NumberFormatException e) {
    		e.printStackTrace();
    		exchange.respond(ResponseCode.BAD_REQUEST);
    	}
	}

}
