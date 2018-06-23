package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class SignupActivity extends Activity implements View.OnClickListener {

    private EditText etxtEmailorPhoneNumber;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

//        Reference to Next Button
        ImageView btnNext = findViewById(R.id.img_next);

//        Set Onclick Listener to Next button
        btnNext.setOnClickListener(this);
    }

    private void startNewAccountActivity(){
        Intent intent = new Intent( this, NewAccountActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.img_next){
            startNewAccountActivity();
        }

    }
}
