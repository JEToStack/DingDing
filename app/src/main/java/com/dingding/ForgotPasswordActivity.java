package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ForgotPasswordActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);

//        Reference to btn Send
        Button btnSend = findViewById(R.id.btn_send);

//        Set onClick listener to send button
        btnSend.setOnClickListener(this);
    }

    private void startResetPasswordActivty(){
        Intent intent = new Intent( this, ResetPasswordActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if(view.getId() == R.id.btn_send){
            startResetPasswordActivty();
        }

    }
}
