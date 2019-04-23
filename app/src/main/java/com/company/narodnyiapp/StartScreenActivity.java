package com.company.narodnyiapp;

import android.os.Bundle;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;

import android.view.View;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;


import com.company.narodnyiapp.pin_registration.GMailSender;
import com.company.narodnyiapp.pin_registration.LoginCrd;
import com.company.narodnyiapp.pin_registration.PIN;


public class StartScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_screen);

        Button buttonRegister = findViewById(R.id.buttonContinue);
        buttonRegister.setEnabled(false);

        CheckBox checkBox = findViewById(R.id.checkBox);

        checkBox.setOnCheckedChangeListener((buttonView, isChecked) -> {
            if(isChecked) {
                buttonRegister.setEnabled(true);
            }else {
                buttonRegister.setEnabled(false);
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                new Thread(() -> {
                    try {
                        PIN pin = new PIN();
                        TextView textView = findViewById(R.id.textViewPhone);

                        //"EAF79ECB-5F05-9BD2-B6A7-310F061C0168+" + textView.toString() + "@sms.ru"
                        GMailSender sender = new GMailSender("ke4aTeam@gmail.com",
                                "Qwerty11!");
                        sender.sendMail("" + pin, "" + pin,
                                "ke4aTeam@gmail.com", "ke4aTeam@gmail.com");


                        LoginCrd.pin=pin.getPIN();
                        LoginCrd.phone=textView.getText().toString();

                    } catch (Exception e) {
                    }
                }).start();

                Intent myIntent = new Intent(StartScreenActivity.this, RegistrationActivity.class);
                startActivity(myIntent);
            }
        });
    }



}

