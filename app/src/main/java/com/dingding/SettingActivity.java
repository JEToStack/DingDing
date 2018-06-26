package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class SettingActivity extends Activity implements View.OnClickListener{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

//        reference to back imageView
        ImageView imgBack = findViewById(R.id.img_back_in_setting);
//        set listener to back ImageView
        imgBack.setOnClickListener(this);

//        reference to Email LinearLayout
        LinearLayout lnEmail = findViewById(R.id.ln_email);
//        set On click listener to Email LinearLayout
        lnEmail.setOnClickListener(this);

//        reference to Password LinearLayout
        LinearLayout lnPassword = findViewById(R.id.ln_password);
//        Set onClick listener to Password LinearLayout
        lnPassword.setOnClickListener(this);

//        reference to Save LinearLayout
        LinearLayout lnSave = findViewById(R.id.ln_save);
//        set OnClick listener to save LinearLayout
        lnSave.setOnClickListener(this);

//        reference to Post you've like LinearLayout
        LinearLayout lnPostYouHaveLike = findViewById(R.id.ln_post_you_liked);
//        Set onClick listener to Post you have like LinearLayout
        lnPostYouHaveLike.setOnClickListener(this);

//        reference to Search History LinearLayout
        LinearLayout lnSearchHistory = findViewById(R.id.ln_search_history);
//        Set onClick listener to Search History LinearLayout
        lnSearchHistory.setOnClickListener(this);

//        reference to Language LinearLayout
        LinearLayout lnLanguage = findViewById(R.id.ln_language);
//        Set oncClick listener to Language
        lnLanguage.setOnClickListener(this);

//        reference to Log Out
        LinearLayout lnLogOut = findViewById(R.id.ln_log_out);
//        Set onClick Listener to Log Out
        lnLogOut.setOnClickListener(this);
    }

    private void startBackActivity(){
        finish();
    }

    private void startLogOutActivity(){
        Intent intent = new Intent( this, LoginActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.img_back_in_setting){
            startBackActivity();
        }
        else if (view.getId() == R.id.ln_email){
            String message = "This function is under construction.";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.ln_password){
            String message = "This function is under construction.";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.ln_save){
            String message = "This function is under construction.";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.ln_post_you_liked){
            String message = "This function is under construction.";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.ln_search_history){
            String message = "This function is under construction.";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.ln_language){
            String message = "This function is under construction.";
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
        else if (view.getId() == R.id.ln_log_out){
            startLogOutActivity();
        }

    }
}
