package com.company.narodnyiapp;

import android.Manifest;
import android.content.Intent;
import android.provider.MediaStore;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.company.narodnyiapp.exception.NoAccessException;
import com.company.narodnyiapp.location.MyLocationListener;
import com.company.narodnyiapp.rules.RulesActivity;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        ImageButton btn;
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


        TextView textView;

        textView =findViewById(R.id.textView3);

        try{
            MyLocationListener.SetUpLocationListener(MainActivity.this);

            textView.setText(MyLocationListener.imHere.toString());
        }catch (NoAccessException ignored){
            textView.setText("No location permission, please access it");
            btn.setActivated(false);
        }






    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this, RulesActivity.class);
        MainActivity.this.startActivity(myIntent);
    }


}
