package com.company.narodnyiapp;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;

import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;


import com.company.narodnyiapp.rules.RulesActivity;


public class MainActivity extends AppCompatActivity {

    ImageButton btn;


    int CAMERA_R;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn= findViewById(R.id.cameraButton);
        btn.setOnClickListener(v -> {
            Intent i=new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(i,CAMERA_R);

        });

        placeholder=findViewById(R.id.all_rq);

        placeholder.setText(getIntent().getStringExtra("message"));


        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.ACCESS_FINE_LOCATION},
                1);
    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this, RulesActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (resultCode == -1) {

            Intent i1=new Intent(this,SentForm.class);
            startActivity(i1);
        }
    }

    TextView placeholder;





}
