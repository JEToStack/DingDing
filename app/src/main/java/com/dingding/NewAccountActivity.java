package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class NewAccountActivity extends Activity implements View.OnClickListener {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_account);

//        reference to Next button

        Button btnNext = findViewById(R.id.btn_next_to_usersetupprofile);
//        set on Click listener to Next button
        btnNext.setOnClickListener(this);
    }

    private  void startUserSetUpProfileActivity(){
        Intent intent = new Intent( this, UserSetUpProfileActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_next_to_usersetupprofile){
            startUserSetUpProfileActivity();
        }

    }
}
