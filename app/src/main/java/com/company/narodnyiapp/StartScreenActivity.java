package com.company.narodnyiapp;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import com.amazonaws.mobile.client.AWSMobileClient;
//import com.company.narodnyiapp.pin_registration.GMailSender;
//import com.company.narodnyiapp.pin_registration.PIN;


public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);
        AWSMobileClient.getInstance().initialize(this).execute();

    }

    public void onClick(View view) {
//        Intent myIntent = new Intent(this, RegistrationActivity.class);
//        startActivity(myIntent);
//        new Thread(() -> {
//            try {
//                PIN pin = new PIN();
//                GMailSender sender = new GMailSender("ke4aTeam@gmail.com",
//                        "Qwerty11!");
//                sender.sendMail("" + pin, "" + pin,
//                        "ke4aTeam@gmail.com", "ke4aTeam@gmail.com");
//            } catch (Exception e) {
//            }
//        }).start();

    }

}

