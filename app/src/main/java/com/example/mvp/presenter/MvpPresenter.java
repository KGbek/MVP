package com.example.mvp.presenter;

import android.widget.Toast;

import com.example.mvp.contract.MVPContracts;
import com.example.mvp.model.MvpModel;
import com.example.mvp.ui.MainActivity;

public class MvpPresenter implements MVPContracts.MvpPresenter{

    com.example.mvp.model.MvpModel MvpModel = new MvpModel();
    MVPContracts.MvpView mvpView;

    @Override
    public void increment() {
        MvpModel.increment();
        mvpView.updateMvp(MvpModel.count);
        if (MvpModel.count == 10){
            mvpView.showToast();
        } else if (MvpModel.count == 15) {
            mvpView.changeColor();
        }
    }

    @Override
    public void decrement() {
        MvpModel.decrement();
        mvpView.updateMvp(MvpModel.count);
    }

    @Override
    public void attachMvpView(MVPContracts.MvpView mvpView) {
        this.mvpView = mvpView;
    }
}
