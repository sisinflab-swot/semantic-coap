package it.poliba.sisinflab.coap;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

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

        for(String v : holder.mItem.mValues) {
            String txt = holder.mContentView.getText() + v + " " ;
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
