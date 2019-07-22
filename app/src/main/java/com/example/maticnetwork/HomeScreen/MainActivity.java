package com.example.maticnetwork.HomeScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.maticnetwork.R;

public class MainActivity extends AppCompatActivity implements MainView{
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainPresenter = new MainPresenter(this);
    }
}
