package it.poliba.sisinflab.coap;

import android.content.Context;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.server.resources.ResourceAttributes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        HashMap<String, List<String>> attr = (HashMap<String, List<String>>) getIntent().getExtras().getSerializable("attributes");
        List<CoapAttribute> list = new ArrayList<>();
        for (String key : attr.keySet()) {
            list.add(new CoapAttribute(key, attr.get(key)));
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.detailsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerView.setAdapter(new CoapAttributeListAdapter(list));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    class CoapAttribute {
        String mName;
        List<String> mValues;

        public CoapAttribute(String name, List<String> values) {
            mName = name;
            mValues = values;
        }
    }
}
