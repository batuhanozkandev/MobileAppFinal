package com.example.mobile_app_lecture_final;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AuthScreen extends AppCompatActivity {

    TextView orText;
    EditText emailInput;
    EditText passwordInput;
    Button logInButton;
    Button doNotHaveAccountButton;
    String clientEmail = "example@gmail.com";
    String clientPassword = "123456";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth_screen);

        orText = findViewById(R.id.or_text);
        emailInput = findViewById(R.id.email_input);
        passwordInput = findViewById(R.id.password_input);
        logInButton = findViewById(R.id.log_in_button);
        doNotHaveAccountButton = findViewById(R.id.do_not_have_account);

        logInButton.setOnClickListener(
                view -> {
                    try {
                        if ((emailInput.getText().toString().equals(clientEmail)
                                && passwordInput.getText().toString().equals(clientPassword))) {
                            startActivity(new Intent(AuthScreen.this, HomeScreen.class));
                        } else {
                            Toast.makeText(getApplicationContext(), "Your inputs are wrong!", Toast.LENGTH_LONG).show();

                        }

                    } catch (Exception e) {

                    }
                }
        );
        doNotHaveAccountButton.setOnClickListener(
                view -> {
                    startActivity(new Intent(AuthScreen.this, SignUpScreen.class));
                }
        );

    }
}