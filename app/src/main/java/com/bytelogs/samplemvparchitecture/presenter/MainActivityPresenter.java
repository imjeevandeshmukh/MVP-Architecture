package com.bytelogs.samplemvparchitecture.presenter;


import android.content.Context;

import com.bytelogs.samplemvparchitecture.contract.MainActivityContract;
import com.bytelogs.samplemvparchitecture.model.MainActivityModel;

public class MainActivityPresenter implements MainActivityContract.presenter {
    MainActivityContract.view mView;
    Context context;
    MainActivityModel model;
    public MainActivityPresenter(MainActivityContract.view view,Context context) {
        mView = view;
        this.context = context;
        initPresenter();
    }

    private void initPresenter() {
        model = new MainActivityModel(context);
        mView.initviews();
    }


    @Override
    public void onClickButton() {
        String[] m = model.getData();
        mView.populateListView(m);
    }
}
