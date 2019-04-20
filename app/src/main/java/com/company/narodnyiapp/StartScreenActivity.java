package com.company.narodnyiapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this, RegistrationActivity.class);
        startActivity(myIntent);

    }
}

