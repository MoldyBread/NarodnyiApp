package com.company.narodnyiapp.rules;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public abstract class Presenter {

    protected View view;
    private AppCompatActivity activity;

    public Presenter(View view, AppCompatActivity activity) {
        this.view = view;
        this.activity = activity;
        onCreateView();
    }

    public abstract void onCreateView();


    public View getView() {
        return view;
    }
}
