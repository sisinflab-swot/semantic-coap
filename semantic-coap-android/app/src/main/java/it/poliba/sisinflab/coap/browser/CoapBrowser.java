package it.poliba.sisinflab.coap.browser;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Environment;
import android.preference.PreferenceManager;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.LinkFormat;

import java.io.File;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import it.poliba.sisinflab.coap.DiscoveryUtils;
import it.poliba.sisinflab.coap.MainTabActivity;
import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;

public class CoapBrowser {

    String serverAddress;
    CoapClient client;

    public CoapBrowser(String address) {
        serverAddress = "coap://" + address;
        client = new CoapClient(serverAddress);
    }

    public List<WebLink> discovery(Context ctx) {
        String uriQuery = getUriQuery(ctx);
        client.setURI(serverAddress + "/.well-known/core" + uriQuery);
        client.setTimeout(10000);
        CoapResponse resp = client.get();
        if (resp != null) {
            Set<WebLink> resources = LinkFormat.parse(resp.getResponseText());
            return new ArrayList<WebLink>(resources);
        } else
            return new ArrayList<WebLink>();
    }

    private String getUriQuery(Context ctx) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(ctx);
        HashMap<String, String> semQueries = new HashMap<String, String>();

        String sd = "";
        boolean semantics = prefs.getBoolean("enable_coap_semantic", false);
        if (semantics) {
            String st = prefs.getString(SemanticLinkFormat.SEMANTIC_TASK + "_key", "0");
            String sr = prefs.getString(SemanticLinkFormat.SEMANTIC_THRESHOLD + "_key", "100");
            String sd_file = prefs.getString(SemanticLinkFormat.SEMANTIC_DESCRIPTION + "_key", "");
            sd = getSemanticDescription(sd_file);

            semQueries.put(SemanticLinkFormat.SEMANTIC_TASK, st);
            semQueries.put(SemanticLinkFormat.SEMANTIC_THRESHOLD, sr);
            semQueries.put(SemanticLinkFormat.SEMANTIC_DESCRIPTION, "");
        }

        boolean geo = prefs.getBoolean("enable_coap_geo", false);
        if (geo) {
            String lat = prefs.getString(SemanticLinkFormat.LATITUDE + "_key", "0");
            String lon = prefs.getString(SemanticLinkFormat.LONGITUDE + "_key", "0");
            String md = prefs.getString(SemanticLinkFormat.MAX_DISTANCE + "_key", "10000");

            semQueries.put(SemanticLinkFormat.MAX_DISTANCE, md);
            semQueries.put(SemanticLinkFormat.LATITUDE, lat);
            semQueries.put(SemanticLinkFormat.LONGITUDE, lon);
        }

        semQueries.put(SemanticLinkFormat.CURRENT_HOP, "0");
        return DiscoveryUtils.buildUriQuery(semQueries, sd);
    }

    private String getSemanticDescription(String filename) {
        String sd = "";
        String path = Environment.getExternalStorageDirectory().toString();
        File file = new File(path + "/owleditor", filename + ".owl");
        try {
            FileInputStream fis = new FileInputStream(file);
            String owl = AndroidSDEncoder.convertStreamToString(fis);
            sd = MainTabActivity.sd.encodeOWL(owl);
            sd = URLEncoder.encode(sd, "UTF-8");
            fis.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return sd;
    }

}
