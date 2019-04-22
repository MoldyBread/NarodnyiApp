package com.company.narodnyiapp.rules.presenters;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.company.narodnyiapp.R;
import com.company.narodnyiapp.rules.Presenter;

public class FirstPresenter extends Presenter {

    private TextView textView;

    public FirstPresenter(View view, AppCompatActivity activity) {
        super(view, activity);
    }

    @Override
    public void onCreateView() {
        textView = (TextView) view.findViewById(R.id.first_txt);
    }
}
