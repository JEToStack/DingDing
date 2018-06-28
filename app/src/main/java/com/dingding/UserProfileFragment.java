package com.dingding;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class UserProfileFragment extends Fragment implements View.OnClickListener{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.activity_user_profile,null);


//        reference to setting imageView
        ImageView imgSetting = view.findViewById(R.id.img_setting);
//        set onclick listener to setting imageView
        imgSetting.setOnClickListener(this);

//        reference to back imageView
        ImageView imgBack = view.findViewById(R.id.img_back);
//        set listener to Back imageView
        imgBack.setOnClickListener(this);

        return view;
    }

    private void startSettingActivity(){
        Intent intent = new Intent(getActivity(), SettingActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {


        if (view.getId() == R.id.img_setting){
            startSettingActivity();
        }

    }
}
