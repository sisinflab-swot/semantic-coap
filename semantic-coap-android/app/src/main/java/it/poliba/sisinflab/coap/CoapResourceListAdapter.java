package it.poliba.sisinflab.coap;

import android.support.design.widget.FloatingActionButton;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

import org.eclipse.californium.core.WebLink;
import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.coap.MediaTypeRegistry;

import java.util.List;

import it.poliba.sisinflab.coap.semantic.SemanticLinkFormat;

public class CoapResourceListAdapter extends RecyclerView.Adapter<CoapResourceListAdapter.ViewHolder> {

    private final List<WebLink> mValues;
    private final OnListFragmentInteractionListener mListener;

    public CoapResourceListAdapter(List<WebLink> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_coap_resource_item, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        String[] segments = holder.mItem.getURI().split("/");
        String name = segments[segments.length-1];
        holder.mIdView.setText(name);
        holder.mUrlView.setText(holder.mItem.getURI());

        String ct = "";
        if (holder.mItem.getAttributes().getAttributeValues(LinkFormat.CONTENT_TYPE).size() > 0)
            ct = MediaTypeRegistry.toString(Integer.parseInt(holder.mItem.getAttributes().getAttributeValues(LinkFormat.CONTENT_TYPE).get(0)));
        holder.mContentView.setText(ct);

        if (holder.mItem.getAttributes().containsAttribute(SemanticLinkFormat.SEMANTIC_THRESHOLD)) {
            int rank = (int) Float.parseFloat(holder.mItem.getAttributes().getAttributeValues(SemanticLinkFormat.SEMANTIC_THRESHOLD).get(0));
            holder.mBar.setProgress(rank);
        } else
            holder.mBar.setProgress(0);

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final ProgressBar mBar;
        public final TextView mIdView;
        public final TextView mUrlView;
        public final TextView mContentView;
        public WebLink mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mBar = (ProgressBar) view.findViewById(R.id.rankBar);
            mIdView = (TextView) view.findViewById(R.id.id);
            mUrlView = (TextView) view.findViewById(R.id.url);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }

    public void updateValues(List<WebLink> values) {
        mValues.clear();
        mValues.addAll(values);
    }
}
