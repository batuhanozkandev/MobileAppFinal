package com.example.mobile_app_lecture_final;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;

public class SignUpScreen extends AppCompatActivity {

    EditText emailInputSignUp;
    EditText passwordInputSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_screen);

        emailInputSignUp = findViewById(R.id.email_input_sign_up);
        passwordInputSignUp = findViewById(R.id.password_input_sign_up);


    }
}