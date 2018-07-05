package com.bytelogs.samplemvparchitecture.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import com.bytelogs.samplemvparchitecture.R;
import com.bytelogs.samplemvparchitecture.contract.MainActivityContract;
import com.bytelogs.samplemvparchitecture.presenter.MainActivityPresenter;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements MainActivityContract.view{
    ListView listView;
    Button button;
    MainActivityPresenter mainActivityPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainActivityPresenter = new MainActivityPresenter(this,MainActivity.this);
    }

    @Override
    public void initviews() {
        listView = findViewById(R.id.listView);
        button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mainActivityPresenter.onClickButton();
            }
        });
    }

    @Override
    public void populateListView(String[] m) {
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,m);
        listView.setAdapter(arrayAdapter);
    }
}
