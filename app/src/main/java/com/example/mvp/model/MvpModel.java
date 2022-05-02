package com.example.mvp.model;

public class MvpModel {

    public int count = 0;

    public int getCount() {
        return count;
    }

    public void increment(){
        ++count;
    }

    public void decrement(){
        --count;
    }
}
