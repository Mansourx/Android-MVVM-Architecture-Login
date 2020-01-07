package com.example.mvvmexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.mvvmexample.databinding.ActivityMainBinding;
import com.example.mvvmexample.model.User;
import com.example.mvvmexample.viewModel.UserModel;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        UserModel userModel = new UserModel(new User("Email","Password"));
        activityMainBinding.setLogin(userModel);
    }
}
