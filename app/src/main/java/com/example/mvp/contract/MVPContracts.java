package com.example.mvp.contract;

public class MVPContracts {

    public interface MvpPresenter {
        void increment();
        void decrement();
        void attachMvpView(MvpView mvpView);
    }

    public interface MvpView {
        void updateMvp(int count);
        void showToast();
        void changeColor();
    }
}
