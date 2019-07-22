package com.example.maticnetwork.Util;

import android.content.Context;
import android.content.Intent;

import com.example.maticnetwork.HomeScreen.MainActivity;
import com.example.maticnetwork.Login.LoginActivity;
import com.example.maticnetwork.SignUp.SignUpActivity;

public class ActivityUtil {
    Context context;
    public ActivityUtil(Context context) {
        this.context = context;
    }

    public void startLoginActivity() {
        context.startActivity(new Intent(context, LoginActivity.class));
    }

    public void startSignUpActivity() {
        context.startActivity(new Intent(context, SignUpActivity.class));
    }
}
