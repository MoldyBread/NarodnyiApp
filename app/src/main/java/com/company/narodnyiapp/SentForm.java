package com.company.narodnyiapp;

import android.content.Intent;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SentForm extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent_form);


    }

    public void onClick(View view) {
        Intent intent=new Intent(this, MainActivity.class);
        TextView textView = findViewById(R.id.carPlate);
        intent.putExtra("message",textView.getText());
        startActivity(intent);
    }
}
