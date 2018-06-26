package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;

public class ResetPasswordActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reset_password);

//        reference to Done Button
        Button btnDone = findViewById(R.id.btn_done);
//        set onClick listener to Done Button
        btnDone.setOnClickListener(this);
    }

    private void startDoneActivity(){
        Intent intent = new Intent( this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btn_done){
            startDoneActivity();
        }

    }
}
