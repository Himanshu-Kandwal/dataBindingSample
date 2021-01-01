package com.example.databindingsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.example.databindingsample.databinding.ActivityMainBinding;
import com.example.databindingsample.models.User;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //set content view using binding
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user;
        user= new User();
        user.setName("Himanshu");
        user.setEmail("himanshu@gmail.com");

        activityMainBinding.setUser(user);

    }
}