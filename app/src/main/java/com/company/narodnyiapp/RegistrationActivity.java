package com.company.narodnyiapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.company.narodnyiapp.pin_registration.PIN;

public class RegistrationActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }


    public void onClick(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        RegistrationActivity.this.startActivity(intent);
    }
}
