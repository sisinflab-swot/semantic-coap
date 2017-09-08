package it.poliba.sisinflab.codec;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class GZIPEncoder extends OWLEncoder {

	@Override
	public String encodeOWL(String owl) {
		if (owl == null || owl.length() == 0) {
            return owl;
        } 
		
        ByteArrayOutputStream obj = new ByteArrayOutputStream();
        
        try {
        	GZIPOutputStream gzip = new GZIPOutputStream(obj);
			gzip.write(owl.getBytes("UTF-8"));
			gzip.close();
			
			byte[] out = obj.toByteArray();
			return this.encodeBase64(out);
			
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public String decodeOWL(String owl) {
		if (owl == null || owl.length() == 0) {
            return owl;
        }
		       
        byte[] gzip = this.decodeBase64(owl);

		try {
			GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(gzip));
			BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "UTF-8"));
	        String outStr = "";
	        String line;
	        while ((line=bf.readLine())!=null) {
	          outStr += line;
	        }
	        return outStr;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}        
	}

}
