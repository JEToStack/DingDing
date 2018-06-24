package com.dingding;

import android.content.Context;
import android.util.Log;
import android.widget.ImageView;

import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.mindorks.placeholderview.annotations.Layout;
import com.mindorks.placeholderview.annotations.NonReusable;
import com.mindorks.placeholderview.annotations.Resolve;
import com.mindorks.placeholderview.annotations.View;
import com.mindorks.placeholderview.annotations.swipe.SwipeCancelState;
import com.mindorks.placeholderview.annotations.swipe.SwipeIn;
import com.mindorks.placeholderview.annotations.swipe.SwipeInState;
import com.mindorks.placeholderview.annotations.swipe.SwipeOut;
import com.mindorks.placeholderview.annotations.swipe.SwipeOutState;

@NonReusable
@Layout(R.layout.activity_matching_card_view_item)
public class MatchingCard {
    @View(R.id.matching_user_img)
    private ImageView userImageView;

    private UserInfo mUserInfo;
    private Context mContext;
    private SwipePlaceHolderView mSwipeView;

    public MatchingCard(UserInfo mUserInfo, Context mContext, SwipePlaceHolderView mSwipeView) {
        this.mUserInfo = mUserInfo;
        this.mContext = mContext;
        this.mSwipeView = mSwipeView;
    }




    @Resolve
    public void onResolve(){
        userImageView.setImageResource(mUserInfo.getUserImg());
    }

    @SwipeOut
    public void onSwipedOut(){
        Log.d("EVENT","onSwipedOut");
        mSwipeView.addView(this);
    }

    @SwipeCancelState
    public void onSwipeCancelState() {
        Log.d("DEBUG", "onSwipeCancelState");
    }

    @SwipeIn
    public void onSwipeIn() {
        Log.d("DEBUG", "onSwipedIn");
    }

    @SwipeInState
    public void onSwipeInState() {
        Log.d("DEBUG", "onSwipeInState");
    }

    @SwipeOutState
    public void onSwipeOutState() {
        Log.d("DEBUG", "onSwipeOutState");
    }

}
