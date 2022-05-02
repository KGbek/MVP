package com.example.mvp.helper;

import com.example.mvp.presenter.MvpPresenter;

public class Injector {

    public static MvpPresenter getPresenter() {
        return new MvpPresenter();
    }
}
