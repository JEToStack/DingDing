package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;

public class StartupActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_startup);
        delayToStartLoginActivity();
    }

    private void delayToStartLoginActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startLoginActivity();
                finishStartLoginActivity();
            }
        },3000);
    }

    private void startLoginActivity(){
        Intent intent = new Intent( this, LoginActivity.class);
        startActivity(intent);
    }

    private void finishStartLoginActivity(){
        finish();
    }
}
