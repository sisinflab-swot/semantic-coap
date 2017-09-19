package it.poliba.sisinflab.coap.share;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorManager;

import org.eclipse.californium.core.CoapClient;
import org.eclipse.californium.core.CoapServer;
import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.network.config.NetworkConfig;

import java.util.ArrayList;
import java.util.Set;

public class AndroidCoapServer extends CoapServer {

    private SensorManager mSensorManager;
    private Context ctx;

    public static AndroidCoapServer newSensorServer(Context ctx) {
        NetworkConfig config = NetworkConfig.createStandardWithoutFile();
        config.setInt(NetworkConfig.Keys.ACK_TIMEOUT, 60000);
        config.setInt(NetworkConfig.Keys.PREFERRED_BLOCK_SIZE, 2048);

        return new AndroidCoapServer(config, ctx);
    }

    public AndroidCoapServer(NetworkConfig config, Context ctx) {
        super(config);
        this.ctx = ctx;
        initDeviceSensors();
    }

    private void initDeviceSensors() {
        mSensorManager = (SensorManager) ctx.getSystemService(Context.SENSOR_SERVICE);

        Sensor mLight = mSensorManager.getDefaultSensor(Sensor.TYPE_LIGHT);
        AndroidResource res = new AndroidResource("light", mLight, mSensorManager);
        res.getAttributes().addContentType(MediaTypeRegistry.TEXT_PLAIN);
        add(res);
    }

    public ArrayList<WebLink> getResources() {
        String address = "coap://localhost:5683";
        CoapClient client = new CoapClient(address);
        Set<WebLink> resources = client.discover();
        return new ArrayList<WebLink>(resources);
    }

}
