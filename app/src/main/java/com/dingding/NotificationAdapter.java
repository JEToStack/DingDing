package com.dingding;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class NotificationAdapter extends RecyclerView.Adapter<NotificationAdapter.ViewHolder> {

    private ArrayList<NotificationItem> items;

    public NotificationAdapter (ArrayList<NotificationItem> items) {
        this.items = items;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImgView;
        public TextView mUsername;
        public TextView mDesc;
        public TextView mTimestamp;

        public ViewHolder(View itemView)
        {
            super(itemView);
            this.mImgView = (ImageView) itemView.findViewById(R.id.user_profile_pic);
            this.mUsername = (TextView) itemView.findViewById(R.id.username);
            this.mDesc = (TextView) itemView.findViewById(R.id.notification_description);
            this.mTimestamp = (TextView) itemView.findViewById(R.id.notification_timestamp);
        }
    }

    @NonNull
    @Override
    public NotificationAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_notification_item,null);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull NotificationAdapter.ViewHolder holder, int position) {
            NotificationItem n = items.get(position);

            holder.mImgView.setImageResource(n.getUserImage());
            holder.mUsername.setText(n.getUsername());
            holder.mDesc.setText(n.getDesc());
            holder.mTimestamp.setText(n.getTimeStamp());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }
}
