package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

public class SettingActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

//        reference to back imageView
        ImageView imgBack = findViewById(R.id.img_back_in_setting);
//        set listener to back ImageView
        imgBack.setOnClickListener(this);
    }

    private void startBackActivity(){
        finish();
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.img_back_in_setting){
            startBackActivity();
        }

    }
}
