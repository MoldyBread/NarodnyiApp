package com.company.narodnyiapp;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;



import com.company.narodnyiapp.rules.RulesActivity;


public class MainActivity extends AppCompatActivity {

    ImageButton btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.cameraButton);
        btn.setOnClickListener(v -> {
            Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivity(i);
        });

        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                1);
    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this, RulesActivity.class);
        MainActivity.this.startActivity(myIntent);
    }



}
