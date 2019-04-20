package com.company.narodnyiapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this, RulesActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void cameraOnClick(View view) {
        //TODO: Camera intent
    }


}
