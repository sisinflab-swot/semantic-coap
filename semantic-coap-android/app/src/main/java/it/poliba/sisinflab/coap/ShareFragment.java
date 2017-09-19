package it.poliba.sisinflab.coap;

import android.app.Service;
import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Bundle;
import android.os.StrictMode;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.format.Formatter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.eclipse.californium.core.WebLink;

import java.util.ArrayList;
import java.util.List;

import it.poliba.sisinflab.coap.share.AndroidCoapServer;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class ShareFragment extends Fragment {

    private OnListFragmentInteractionListener mListener;
    private View view = null;
    private TextView serverAddress;

    private boolean run = false;
    private AndroidCoapServer server = null;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public ShareFragment() {
    }

    public static ShareFragment newInstance() {
        ShareFragment fragment = new ShareFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        if (view == null) {
            view = inflater.inflate(R.layout.fragment_coap_share_list, container, false);
            Context context = view.getContext();
            serverAddress = (TextView) view.findViewById(R.id.serverAddress);
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.list);
            recyclerView.setLayoutManager(new LinearLayoutManager(context));

            recyclerView.setAdapter(new CoapResourceListAdapter(new ArrayList<WebLink>(), mListener));
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

            FloatingActionButton fabSearch = (FloatingActionButton) view.findViewById(R.id.fabSearch);
            if (run)
                fabSearch.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_cancel_white_24dp));
            else
                fabSearch.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_play_circle_white_24dp));

            fabSearch.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    if (run) {
                        server.stop();
                        run = false;
                        fabSearch.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_play_circle_white_24dp));
                        serverAddress.setText(getString(R.string.coap_server_na));
                    } else {
                        server = AndroidCoapServer.newSensorServer(getContext());
                        server.start();
                        run = true;
                        fabSearch.setImageDrawable(ContextCompat.getDrawable(getContext(), R.drawable.ic_cancel_white_24dp));
                        serverAddress.setText("CoAP server: " + getIPAddress() + ":5683");

                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                List<WebLink> resources = server.getResources();
                                ((CoapResourceListAdapter)recyclerView.getAdapter()).updateValues(resources);
                                recyclerView.getAdapter().notifyDataSetChanged();
                            }
                        });
                    }
                }
            });
        }
        return view;
    }

    private String getIPAddress() {
        WifiManager wifiMgr = (WifiManager) getContext().getApplicationContext().getSystemService(Service.WIFI_SERVICE);
        WifiInfo wifiInfo = wifiMgr.getConnectionInfo();
        int ip = wifiInfo.getIpAddress();
        return Formatter.formatIpAddress(ip);
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

}
