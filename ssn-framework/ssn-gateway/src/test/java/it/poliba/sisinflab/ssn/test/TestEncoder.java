package it.poliba.sisinflab.ssn.test;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URISyntaxException;
import java.nio.charset.Charset;

import org.apache.commons.io.IOUtils;

import it.poliba.sisinflab.codec.GZIPEncoder;
import it.poliba.sisinflab.codec.SDEncoder;
import it.poliba.sisinflab.ssn.GatewayServer;

public class TestEncoder {
	
	static GZIPEncoder gzip;
	static SDEncoder sd;
	
	private static String ONTOLOGY = "SensorOntology.owl";

	public static void main(String[] args) throws IOException, URISyntaxException {
		InputStream in = GatewayServer.class.getClassLoader().getResourceAsStream(ONTOLOGY);
		
		gzip = new GZIPEncoder();
		sd = new SDEncoder(IOUtils.toByteArray(in));
		
		FileOutputStream fos = new FileOutputStream("model-ssn.dic");
		DataOutputStream out = new DataOutputStream(fos);
		sd.saveModel(out);
		out.flush();
		out.close();
		
		encodeTest(new File(TestEncoder.class.getResource("/sensors").toURI()));
		encodeTest(new File(TestEncoder.class.getResource("/actuators").toURI()));
		//encodeTest(new File(TestEncoder.class.getResource("/weather-events").toURI()));
		//encodeTest(new File(TestEncoder.class.getResource("/fire-events").toURI()));
		//encodeTest(new File(TestEncoder.class.getResource("/cars").toURI()));
		//encodeTest(new File(TestEncoder.class.getResource("/requests").toURI()));
	}
	
	private static void encodeTest(File file) throws URISyntaxException, IOException {
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				encodeTest(f);
			}
		} else {
			String owl = IOUtils.toString(file.toURI(), Charset.defaultCharset());
			
			String owl_gzip = gzip.encodeOWL(owl);
			String owl_sd = sd.encodeOWL(owl);
			
			System.out.println(file.getName());
			//System.out.println("-- GZIP\t" + owl_gzip.length());
			System.out.println("-- SD\t" + owl_sd.length() + "\n" + owl_sd);
		}	
	}

}
