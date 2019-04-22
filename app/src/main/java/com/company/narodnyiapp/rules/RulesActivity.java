package com.company.narodnyiapp.rules;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.company.narodnyiapp.R;
import com.company.narodnyiapp.rules.presenters.FirstPresenter;
import com.company.narodnyiapp.rules.presenters.SecondPresenter;
import com.company.narodnyiapp.rules.presenters.ThirdPresenter;

public class RulesActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private ViewAdapter viewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rules);

        viewPager = findViewById(R.id.view_pager);
        viewPager.setOffscreenPageLimit(2);

        setViewAdapter();
    }


    private void setViewAdapter(){
        viewAdapter = new ViewAdapter();

        viewAdapter.addView(new FirstPresenter(findViewById(R.id.one),this));
        viewAdapter.addView(new ThirdPresenter(findViewById(R.id.two),this));
        viewAdapter.addView(new SecondPresenter(findViewById(R.id.three),this));

        viewPager.setAdapter(viewAdapter);
    }

    public void skipOnClick(View view) {
        finish();
    }
}
