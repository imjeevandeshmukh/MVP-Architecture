package com.bytelogs.samplemvparchitecture.contract;

public interface MainActivityContract {

     interface view{
        void initviews();
        void populateListView(String[] m);
    }
    interface model{
        String[] getData();
    }
    interface presenter{
        void onClickButton();
    }
}
