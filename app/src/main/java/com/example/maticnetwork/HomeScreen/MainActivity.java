package com.example.maticnetwork.HomeScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.maticnetwork.R;
import com.example.maticnetwork.Util.ActivityUtil;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements MainView{
    @BindView(R.id.signUp)
    Button signUp;
    @BindView(R.id.Login)
    Button login;
    MainPresenter mainPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife .bind(this);
        mainPresenter = new MainPresenter(this);
    }

    public void onSignUpClick(View view) {
        mainPresenter.onSignUp();
    }

    public void onLoginClick(View view) {
        mainPresenter.onLogin();

    }

    @Override
    public void doLogin() {
        new ActivityUtil(this).startLoginActivity();
    }

    @Override
    public void doSignUp() {
        new ActivityUtil(this).startSignUpActivity();
    }
}
