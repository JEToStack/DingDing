package com.dingding;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipePlaceHolderView;

public class MatchingFragment extends Fragment{

    private SwipePlaceHolderView mSwipeView;
    private Context mContext;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.activity_matching,null);

        mSwipeView = (SwipePlaceHolderView) rootView.findViewById(R.id.matching_swipe_view);

        mSwipeView.getBuilder().setDisplayViewCount(5).setSwipeDecor(new SwipeDecor().setPaddingTop(20).setRelativeScale(0.01f).setSwipeInMsgLayoutId(R.layout.activity_matching_swipe_in_msg_view).setSwipeOutMsgLayoutId(R.layout.activity_matching_swipe_out_msg_view));

        for(UserInfo userinfo : UserInfoCollection.getUsers()){
            mSwipeView.addView(new MatchingCard(userinfo, getContext() , mSwipeView));
        }

        return rootView;
    }
}
