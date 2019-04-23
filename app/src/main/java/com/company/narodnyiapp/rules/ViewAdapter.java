package com.company.narodnyiapp.rules;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;


public class ViewAdapter extends PagerAdapter {

    private final List<Presenter> presenterList = new ArrayList<>();

    @Override
    public int getCount() {
        return presenterList.size();
    }

    public void addView(Presenter presenter){
        presenterList.add(presenter);
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object o) {
        return view==o;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        View current = presenterList.get(position).getView();
        return current;
    }
}
