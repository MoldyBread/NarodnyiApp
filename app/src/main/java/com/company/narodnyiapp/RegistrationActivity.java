package com.company.narodnyiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TextInputEditText;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.company.narodnyiapp.pin_registration.LoginCrd;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void onClick(View view) {

        TextInputLayout textInputLayout = findViewById(R.id.enter_PIN);


        String s2=String.valueOf(textInputLayout.getEditText().getText());

        if(LoginCrd.pin.equals(s2)) {
            Intent intent = new Intent(this, MainActivity.class);
            RegistrationActivity.this.startActivity(intent);
        }
    }
}
