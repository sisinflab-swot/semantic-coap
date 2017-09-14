package it.poliba.sisinflab.coap.browser;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapResponse;
import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.LinkFormat;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class CoapBrowser {

    String serverAddress;
    CoapClient client;

    public CoapBrowser(String address) {
        serverAddress = "coap://" + address;
        client = new CoapClient(serverAddress);
    }

    public List<WebLink> discovery() {
        client = new CoapClient(serverAddress + "/.well-known/core");
        client.setTimeout(10000);
        CoapResponse resp = client.get();
        if (resp != null) {
            Set<WebLink> resources = LinkFormat.parse(resp.getResponseText());
            return new ArrayList<WebLink>(resources);
        } else
            return new ArrayList<WebLink>();
    }

}
