package com.example.mvp.ui;

import static android.graphics.Color.GREEN;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.mvp.contract.MVPContracts;
import com.example.mvp.databinding.ActivityMainBinding;
import com.example.mvp.helper.Injector;
import com.example.mvp.presenter.MvpPresenter;

public class MainActivity extends AppCompatActivity implements MVPContracts.MvpView{

    ActivityMainBinding binding;
    MvpPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        presenter = Injector.getPresenter();
        presenter.attachMvpView(this);
        initClickers();
    }

    private void initClickers() {
        binding.decrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.decrement();
            }
        });

        binding.incrementBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                presenter.increment();
            }
        });
    }

    @Override
    public void updateMvp(int count) {
        binding.showTV.setText(String.valueOf(count));
    }

    @Override
    public void showToast() {
        Toast.makeText(this, "Поздравляю!", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void changeColor() {
        binding.showTV.setTextColor(GREEN);
    }
}