package it.poliba.sisinflab.coap.browser;

import android.util.Base64;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

import it.poliba.sisinflab.codec.SDEncoder;

public class AndroidSDEncoder extends SDEncoder {
    public AndroidSDEncoder(byte[] doc) {
        super(doc);
    }

    public AndroidSDEncoder(DataInputStream doc) {
        super(doc);
    }

    public String encodeBase64(byte[] in) {
        return Base64.encodeToString(in, Base64.DEFAULT);
    }

    public byte[] decodeBase64(String in) {
        return Base64.decode(in, Base64.DEFAULT);
    }

    public static String convertStreamToString(InputStream is) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        StringBuilder sb = new StringBuilder();
        String line = null;
        while ((line = reader.readLine()) != null) {
            sb.append(line).append("\n");
        }
        reader.close();
        return sb.toString();
    }
}
