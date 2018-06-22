package com.dingding;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener {

    private EditText etxtEmail;
    private EditText etxtPassword;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
//        Reference to Forgot Password textView
        TextView txtForgotPassword = findViewById(R.id.txt_forgotPassword);

//        Reference to Login button
        Button btnLogin = findViewById(R.id.btn_login);

//        Reference to Signup Button
        Button btnSignup = findViewById(R.id.btn_signup);

//        Reference to Facebook imageView
        ImageView imgLoginwithFaccbook = findViewById(R.id.img_facebook);

//        Reference to Google image
        ImageView imgLoginWithGoogle = findViewById(R.id.img_google);

//        Set Onclick listener to forgotpassword
        txtForgotPassword.setOnClickListener(this);

//        Set Onclick listener to button Login
        btnLogin.setOnClickListener(this);

//        Set Onclick listener to button Signup
        btnSignup.setOnClickListener(this);

//        Set Onclick listener to loginwithFacebook
        imgLoginwithFaccbook.setOnClickListener(this);

//        Set Onclick listener to loginwithGoogle
        imgLoginWithGoogle.setOnClickListener(this);

//        Reference to Username and Password EditText
        etxtEmail = findViewById(R.id.etxt_email);
        etxtPassword = findViewById(R.id.etxt_password);
    }

    private void startMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    private void startSignupActivity(){
        Intent intent = new Intent( this,SignupActivity.class);
        startActivity(intent);
    }

    @Override
    public void onClick(View view) {

        if (view.getId() == R.id.btn_login){
            String email = etxtEmail.getText().toString();
            String password =etxtPassword.getText().toString();
            String message = "This function is under construction.\nemail: " + email + "\nPassword: " + password;
            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }

        else if (view.getId() == R.id.btn_signup){
            startSignupActivity();
        }

    }
}
