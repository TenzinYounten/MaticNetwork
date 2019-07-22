package com.example.maticnetwork.HomeScreen;

class MainPresenter {
    private MainView mainView;
    public MainPresenter(MainView mainView) {
        this.mainView = mainView;
    }

    public void onSignUp() {
        mainView.doSignUp();
    }

    public void onLogin() {
        mainView.doLogin();
    }
}
