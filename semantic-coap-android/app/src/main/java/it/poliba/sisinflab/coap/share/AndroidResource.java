package it.poliba.sisinflab.coap.share;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;

import org.eclipse.californium.core.CoapResource;
import org.eclipse.californium.core.coap.CoAP;
import org.eclipse.californium.core.coap.MediaTypeRegistry;
import org.eclipse.californium.core.server.resources.CoapExchange;

public class AndroidResource extends CoapResource implements SensorEventListener {

    float value = -1;

    public AndroidResource(String name, Sensor sensor, SensorManager mng) {
        super(name);
        mng.registerListener(this, sensor, SensorManager.SENSOR_DELAY_NORMAL);
    }

    @Override
    public void handleGET(CoapExchange exchange) {
        exchange.respond(CoAP.ResponseCode.CONTENT, String.valueOf(value), MediaTypeRegistry.TEXT_PLAIN);
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        value = event.values[0];
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int i) {
        //TODO
    }
}
