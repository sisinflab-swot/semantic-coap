package it.poliba.sisinflab.coap;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import org.eclipse.californium.core.coap.LinkFormat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;
import it.poliba.sisinflab.owleditor.OWLEditorActivity;
import it.poliba.sisinflab.owleditor.OWLIndividualFragment;

public class DetailsActivity extends AppCompatActivity {

    HashMap<String, List<String>> attr;
    String name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

        name = getIntent().getExtras().getString(LinkFormat.TITLE);
        attr = (HashMap<String, List<String>>) getIntent().getExtras().getSerializable("attributes");
        List<CoapAttribute> list = new ArrayList<>();
        for (String key : attr.keySet()) {
            list.add(new CoapAttribute(key, attr.get(key)));
        }

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.detailsList);
        recyclerView.setLayoutManager(new LinearLayoutManager(getBaseContext()));
        recyclerView.setAdapter(new CoapAttributeListAdapter(list));
        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    // create an action bar button
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_details, menu);
        return super.onCreateOptionsMenu(menu);
    }

    // handle button activities
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.buttonMaps) {
            String lat = attr.get(SemanticLinkFormat.LATITUDE).get(0);
            String lon = attr.get(SemanticLinkFormat.LONGITUDE).get(0);

            if (lat != null && lon != null) {
                Intent intent = new Intent(this, MapsActivity.class);
                Bundle extras = new Bundle();
                extras.putString(SemanticLinkFormat.LATITUDE, lat);
                extras.putString(SemanticLinkFormat.LONGITUDE, lon);
                extras.putString(LinkFormat.TITLE, name);
                intent.putExtras(extras);
                startActivity(intent);
            } else
                Toast.makeText(getBaseContext(), "No GPS coordinates found!", Toast.LENGTH_SHORT).show();

        } else if (id == R.id.buttonOpen) {
            String sd = attr.get(SemanticLinkFormat.SEMANTIC_DESCRIPTION).get(0);
            String owl = MainTabActivity.sd.decodeOWL(sd);

            Intent intent = new Intent(this, OWLEditorActivity.class);
            intent.putExtra(getString(R.string.app_style_key), R.style.AppTheme_AppBarOverlay);
            intent.putExtra(getString(R.string.owl_string_key), owl);
            intent.putExtra(getString(R.string.owl_fragment_key), OWLIndividualFragment.class.getSimpleName());
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
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
