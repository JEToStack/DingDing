package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;


public class UserSetUpProfileActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_set_up_profile);

//        reference to next button
        Button btnNext = findViewById(R.id.btn_next_to_main);
//        set onclick listener to Next button
        btnNext.setOnClickListener(this);
    }

    private  void startMainActivity(){
        Intent intent = new Intent( this, MainActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_next_to_main){
            startMainActivity();
        }
    }
}
