package it.poliba.sisinflab.coap.semantic.resources;

import java.util.Random;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.coap.CoAP.ResponseCode;
import org.eclipse.californium.core.server.resources.CoapExchange;
import org.semanticweb.owlapi.model.IRI;

import it.poliba.sisinflab.coap.DiscoveryUtils;
import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;
import it.poliba.sisinflab.codec.OWLEncoder;
import it.poliba.sisinflab.owl.KBManager;

public class SemanticCoapResource extends CoapResource {
	
	OWLEncoder encoder;
	KBManager mng;
	IRI iri;
	String owl;

	public SemanticCoapResource(String name, KBManager mng, OWLEncoder enc) {		
		super(name);
		this.mng = mng;
		this.encoder = enc;
		init();
	}
	
	protected void init() {
		add(new DataResource());
	}
	
	public void setReferenceOntology(String iri) {
		getAttributes().addAttribute(SemanticLinkFormat.REFERENCE_ONTOLOGY, iri);
	}
	
	public void setSemanticDescription(String sd) {
		owl = sd;
		iri = mng.loadIndividualFromString(sd);
		
		try {
			String compressed = encoder.encodeOWL(sd);
			getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_DESCRIPTION, compressed);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		getAttributes().addAttribute(SemanticLinkFormat.REFERENCE_ONTOLOGY, iri.getNamespace());
		getAttributes().setTitle(iri.getFragment());		
	}
	
	public void setEncodedSemanticDescription(String encoded) {
		try {
			owl = encoder.decodeOWL(encoded);
			iri = mng.loadIndividualFromString(owl);			
			getAttributes().setAttribute(SemanticLinkFormat.SEMANTIC_DESCRIPTION, encoded);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		getAttributes().addAttribute(SemanticLinkFormat.REFERENCE_ONTOLOGY, iri.getNamespace());
		getAttributes().setTitle(iri.getFragment());		
	}
	
	public void setAnnotationType(int type) {
		getAttributes().setAttribute(SemanticLinkFormat.ANNOTATION_TYPE, String.valueOf(type));
	}
	
	public void setLocation(double lat, double lon) {
		getAttributes().setAttribute(SemanticLinkFormat.LATITUDE, String.valueOf(lat));
		getAttributes().setAttribute(SemanticLinkFormat.LONGITUDE, String.valueOf(lon));
	}	
	
	public double getLatitude() {
		if (getAttributes().containsAttribute(SemanticLinkFormat.LATITUDE)) {
			return Double.parseDouble(getAttributes().getAttributeValues(SemanticLinkFormat.LATITUDE).get(0));
		} else {
			return -1;
		}		
	}
	
	public double getLongitude() {
		if (getAttributes().containsAttribute(SemanticLinkFormat.LONGITUDE)) {
			return Double.parseDouble(getAttributes().getAttributeValues(SemanticLinkFormat.LONGITUDE).get(0));
		} else {
			return -1;
		}		
	}
	
	public double getDistanceFrom(double lat, double lon) {
		return DiscoveryUtils.distance(lat, getLatitude(), lon, getLongitude(), 0, 0);
	}
	
	public double getSemanticRank(String owl, boolean normalize) {
		IRI req = mng.loadRequestFromString(owl, normalize);
		return mng.getSemanticRank(iri, req);
	}
	
	public double getSemanticRank(IRI req) {
		return mng.getSemanticRank(iri, req);
	}
	
	public IRI getIRI() {
		return iri;
	}
	
	@Override
    public void handleGET(CoapExchange exchange) {
        exchange.respond(ResponseCode.CONTENT, owl);
	}
	
	class DataResource extends CoapResource {
		
		Random gen = new Random(System.currentTimeMillis());

		public DataResource() {
			super("data");
		}
		
		@Override
	    public void handleGET(CoapExchange exchange) {		
			exchange.respond(String.valueOf(gen.nextInt(50)));		
		}
		
	}

}
