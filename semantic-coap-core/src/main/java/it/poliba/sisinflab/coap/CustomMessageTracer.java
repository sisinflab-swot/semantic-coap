package it.poliba.sisinflab.coap;

import java.util.logging.Logger;

import org.eclipse.californium.core.coap.EmptyMessage;
import org.eclipse.californium.core.coap.Request;
import org.eclipse.californium.core.coap.Response;
import org.eclipse.californium.core.network.interceptors.MessageInterceptor;
import org.eclipse.californium.core.network.interceptors.MessageTracer;
import org.eclipse.californium.core.network.serialization.DataSerializer;

public class CustomMessageTracer implements MessageInterceptor {
	
	private final static Logger LOGGER = Logger.getLogger(MessageTracer.class.getCanonicalName());
	private DataSerializer ds = new DataSerializer();
	
	String lastDestionation = "";
	long totReq = 0;
	long totResp = 0;

	public void sendRequest(Request request) {
		if (lastDestionation.equalsIgnoreCase(request.getDestination() + ":" + request.getDestinationPort())) {
			totReq = totReq + ds.serializeRequest(request).length;
		} else {
			lastDestionation = request.getDestination() + ":" + request.getDestinationPort();
			totReq = ds.serializeRequest(request).length;
			totResp = 0;
		}
			
		LOGGER.info(String.format("%s:%d <== req %s\\n%s", request.getDestination(), request.getDestinationPort(), ds.serializeRequest(request).length + "/" + totReq, request));		
	}

	public void sendResponse(Response response) {
		LOGGER.info(String.format("%s:%d <== res %s\\n%s", response.getDestination(), response.getDestinationPort(), ds.serializeResponse(response).length, response));
	}

	public void sendEmptyMessage(EmptyMessage message) {
		LOGGER.info(String.format("%s:%d <== emp %s\\n%s", message.getDestination(), message.getDestinationPort(), ds.serializeEmptyMessage(message).length, message));
	}

	public void receiveRequest(Request request) {
		LOGGER.info(String.format("%s:%d ==> req %s\\n%s", request.getSource(), request.getSourcePort(), ds.serializeRequest(request).length, request));
	}

	public void receiveResponse(Response response) {
		if (lastDestionation.equalsIgnoreCase(response.getSource() + ":" + response.getSourcePort())) {
			totResp = totResp + ds.serializeResponse(response).length;
		} else {
			lastDestionation = response.getSource() + ":" + response.getSourcePort();
			totResp = ds.serializeResponse(response).length;
		}
		
		LOGGER.info(String.format("%s:%d ==> res %s\n%s", response.getSource(), response.getSourcePort(), ds.serializeResponse(response).length + "/" + totResp, response));
	}	

	public void receiveEmptyMessage(EmptyMessage message) {
		LOGGER.info(String.format("%s:%d ==> emp %s\\n%s", message.getSource(), message.getSourcePort(), ds.serializeEmptyMessage(message).length, message));
	}
}
