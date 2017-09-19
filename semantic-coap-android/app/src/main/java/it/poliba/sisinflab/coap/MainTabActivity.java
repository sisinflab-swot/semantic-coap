package it.poliba.sisinflab.coap;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.LinkFormat;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;

import it.poliba.sisinflab.coap.browser.AndroidSDEncoder;

public class MainTabActivity extends AppCompatActivity implements OnListFragmentInteractionListener {

    public static AndroidSDEncoder sd;
    public static String onto_as_string;

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_tab);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        mViewPager.setAdapter(mSectionsPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        try {
            InputStream in = getResources().openRawResource(R.raw.model_ssn);
            DataInputStream dis = new DataInputStream(in);
            sd = new AndroidSDEncoder(dis);
            dis.close();
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            InputStream in = getResources().openRawResource(R.raw.sensor_ontology);
            onto_as_string = AndroidSDEncoder.convertStreamToString(in);
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_tab, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(this, SettingsActivity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onListFragmentInteraction(WebLink item) {
        HashMap<String, List<String>> attr = new HashMap<>();
        for (String key : item.getAttributes().getAttributeKeySet()) {
            attr.put(key, item.getAttributes().getAttributeValues(key));
        }

        String[] segments = item.getURI().split("/");
        String name = segments[segments.length-1];

        Intent intent = new Intent(this, DetailsActivity.class);
        Bundle extras = new Bundle();
        extras.putString(LinkFormat.TITLE, name);
        extras.putSerializable("attributes", attr);
        intent.putExtras(extras);
        startActivity(intent);
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
    public class SectionsPagerAdapter extends FragmentPagerAdapter {

        public SectionsPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position) {
                case 0:
                    return ShareFragment.newInstance();
                case 1:
                    return BrowseFragment.newInstance();
            }
            return null;
        }

        @Override
        public int getCount() {
            // Show 3 total pages.
            return 2;
        }

        @Override
        public CharSequence getPageTitle(int position) {
            switch (position) {
                case 0:
                    return "SHARE";
                case 1:
                    return "BROWSE";
            }
            return null;
        }
    }
}
