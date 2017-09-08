package it.poliba.sisinflab.codec;

import java.util.Base64;

public abstract class OWLEncoder {
	
	public static final int GZIP = 0;
	public static final int SHARED_DICTIONARY = 1;
	
	public String encodeBase64(byte[] in) {
		return Base64.getEncoder().encodeToString(in);
	}
	
	public byte[] decodeBase64(String in) {
		return Base64.getDecoder().decode(in);
	}
	
	public String encodeOWL(String owl) {
		return encodeBase64(owl.getBytes());
	}
	
	public String decodeOWL(String owl) {
		return new String(decodeBase64(owl));
	}

}
