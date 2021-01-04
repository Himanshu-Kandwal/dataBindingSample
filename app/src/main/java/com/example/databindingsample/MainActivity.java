package com.example.databindingsample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.databindingsample.databinding.ActivityMainBinding;
import com.example.databindingsample.models.User;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        //set content view using binding
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        User user;
        user= new User(this);
        user.setName("Himanshu");
        user.setEmail("himanshu@gmail.com");

        activityMainBinding.setUser(user);

        activityMainBinding.button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "CLicked", Toast.LENGTH_LONG).show();
            }
        });
    }

}