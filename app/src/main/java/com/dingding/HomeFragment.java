package com.dingding;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    private RecyclerView mRecycleview;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_post_view_list,null);
        mRecycleview = (RecyclerView) rootView.findViewById(R.id.post_view_list);

        mLayoutManager = new LinearLayoutManager(getActivity());
        mRecycleview.setLayoutManager(mLayoutManager);

        mAdapter = new PostAdapter(PostCollection.getPosts());
        mRecycleview.setAdapter(mAdapter);

        return rootView;
    }
}
