package it.poliba.sisinflab.coap;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.InputType;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Toast;

import org.eclipse.californium.core.WebLink;

import java.util.ArrayList;
import java.util.List;

import it.poliba.sisinflab.coap.browser.CoapBrowser;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class BrowseFragment extends Fragment {

    private OnListFragmentInteractionListener mListener;

    private RecyclerView recyclerView;
    private CoapBrowser mBrowser;
    private View view = null;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public BrowseFragment() {
    }

    @SuppressWarnings("unused")
    public static BrowseFragment newInstance() {
        BrowseFragment fragment = new BrowseFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        if (view == null) {
            view = inflater.inflate(R.layout.fragment_coap_resource_list, container, false);
            recyclerView = (RecyclerView) view.findViewById(R.id.list);

            // Set the adapter
            Context context = view.getContext();
            recyclerView.setLayoutManager(new LinearLayoutManager(context));

            recyclerView.setAdapter(new CoapResourceListAdapter(new ArrayList<WebLink>(), mListener));
            recyclerView.addItemDecoration(new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL));

            FloatingActionButton fabSearch = (FloatingActionButton) view.findViewById(R.id.fabSearch);
            fabSearch.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    openServerAddressDialog(v);
                }
            });
        }

        return view;
    }

    private void openServerAddressDialog(View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this.getActivity());
        builder.setTitle("Server Address");

        // Set up the input
        final EditText input = new EditText(this.getActivity());
        // Specify the type of input expected
        input.setInputType(InputType.TYPE_CLASS_TEXT);
        builder.setView(input);

        // Set up the buttons
        builder.setPositiveButton("Search", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                String address = input.getText().toString();
                try {
                    mBrowser = new CoapBrowser(address);
                    List<WebLink> resources = mBrowser.discovery();

                    ((CoapResourceListAdapter)recyclerView.getAdapter()).updateValues(resources);
                    recyclerView.getAdapter().notifyDataSetChanged();
                } catch (Exception e) {
                    Toast.makeText(v.getContext(), "Malformed Server Address!", Toast.LENGTH_SHORT).show();
                    e.printStackTrace();
                }
            }
        });
        builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        builder.show();
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
