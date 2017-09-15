package it.poliba.sisinflab.coap;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import org.eclipse.californium.core.coap.LinkFormat;
import org.eclipse.californium.core.coap.MediaTypeRegistry;

import java.util.List;

public class CoapAttributeListAdapter extends RecyclerView.Adapter<CoapAttributeListAdapter.ViewHolder> {

    private final List<DetailsActivity.CoapAttribute> mValues;

    public CoapAttributeListAdapter(List<DetailsActivity.CoapAttribute> items) {
        mValues = items;
    }

    @Override
    public CoapAttributeListAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_coap_attribute_item, parent, false);
        return new CoapAttributeListAdapter.ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final CoapAttributeListAdapter.ViewHolder holder, int position) {
        holder.mItem = mValues.get(position);

        holder.mIdView.setText(holder.mItem.mName);

        if (holder.mItem.mName.equalsIgnoreCase(LinkFormat.CONTENT_TYPE)) {
            String value = MediaTypeRegistry.toString(Integer.parseInt(holder.mItem.mValues.get(0)));
            holder.mContentView.setText(value);
        } else {
            String txt = "";
            for (String v : holder.mItem.mValues)
                txt = txt + " " + v;

            holder.mContentView.setText(txt);
        }

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView mIdView;
        public final TextView mContentView;
        public DetailsActivity.CoapAttribute mItem;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            mIdView = (TextView) view.findViewById(R.id.id);
            mContentView = (TextView) view.findViewById(R.id.content);
        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
