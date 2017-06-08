package test.muhammed.com.recyclerviewexample.adapters;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

import test.muhammed.com.recyclerviewexample.R;
import test.muhammed.com.recyclerviewexample.models.UserModel;

/**
 * Created by muhammed on 6/8/2017.
 */

public class UserAdapter extends RecyclerView.Adapter<UserAdapter.ViewHolder> {
    private ArrayList<UserModel> items;
    private Context context;

    public UserAdapter(Context context, ArrayList<UserModel> userModels) {
        this.context = context;
        this.items = userModels;
    }

    @Override
    public UserAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(UserAdapter.ViewHolder holder, int position) {

        holder.mNameTextView.setText(items.get(position).getName());
        holder.mNumberTextView.setText(items.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        protected TextView mNameTextView;
        protected TextView mNumberTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            mNameTextView = (TextView) itemView.findViewById(R.id.nameTextView);
            mNumberTextView = (TextView) itemView.findViewById(R.id.numberTextView);
        }
    }
}
