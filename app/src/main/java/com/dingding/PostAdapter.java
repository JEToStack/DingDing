package com.dingding;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class PostAdapter extends RecyclerView.Adapter<PostAdapter.ViewHolder>{

    private ArrayList<CreatePost> posts;

    public PostAdapter (ArrayList<CreatePost> posts){
        this.posts = posts;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImgView;
        public TextView mUsername;
        public TextView mTimePost;
        public TextView mTextView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.mImgView = (ImageView) itemView.findViewById(R.id.user_profile_pic);
            this.mUsername = (TextView) itemView.findViewById(R.id.username);
            this.mTimePost = (TextView) itemView.findViewById(R.id.post_timestamp);
            this.mTextView = (TextView) itemView.findViewById(R.id.user_post_status);
        }

    }
    @NonNull
    @Override
    public PostAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_post_view_item,null);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull PostAdapter.ViewHolder holder, int position) {
        CreatePost p = posts.get(position);

        holder.mImgView.setImageResource(p.getUserImage());
        holder.mUsername.setText(p.getUsername());
        holder.mTimePost.setText(p.getTimeStamp());
        holder.mTextView.setText(p.getStatusDesc());
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }
}
