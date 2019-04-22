package com.company.narodnyiapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;


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
    }

    public void onClick(View view) {
        Intent myIntent = new Intent(this, RulesActivity.class);
        MainActivity.this.startActivity(myIntent);
    }


}
