package it.poliba.sisinflab.codec;

import java.io.IOException;
import org.toubassi.femtozip.ArrayDocumentList;
import org.toubassi.femtozip.CompressionModel;
import org.toubassi.femtozip.models.FemtoZipCompressionModel;

public class SDEncoder extends OWLEncoder {
	
	CompressionModel model;
	
	public SDEncoder(byte[] doc) {
		try {
			model = new FemtoZipCompressionModel();
	        model.build(new ArrayDocumentList(doc));
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(0);
		}	
	}
	
	@Override
	public String encodeOWL(String owl) {		
		byte[] enc = model.compress(owl.getBytes());
		return this.encodeBase64(enc);		
	}
	
	@Override
	public String decodeOWL(String owl) {
		byte[] dec = this.decodeBase64(owl);
		return new String(model.decompress(dec));
	}

}
