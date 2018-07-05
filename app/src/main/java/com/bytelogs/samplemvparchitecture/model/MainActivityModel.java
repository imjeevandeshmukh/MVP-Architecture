package com.bytelogs.samplemvparchitecture.model;

import android.content.Context;

import com.bytelogs.samplemvparchitecture.R;
import com.bytelogs.samplemvparchitecture.contract.MainActivityContract;

public class MainActivityModel implements MainActivityContract.model{
    Context context;
    public MainActivityModel(Context context) {
        this.context = context;
    }

    @Override
    public String[] getData() {
        String[] m = context.getResources().getStringArray(R.array.somelist);
        return m;
    }
}
