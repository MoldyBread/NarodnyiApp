package com.company.narodnyiapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class RulesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);
    }

    public void skipOnClick(View view) {
        finish();
    }
}
