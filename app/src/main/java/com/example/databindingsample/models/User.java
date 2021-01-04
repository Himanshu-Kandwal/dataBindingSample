package com.example.databindingsample.models;

import android.content.Context;
import android.view.View;
import android.widget.Toast;

public class User {
    String name;
    String email;
    Context context;

    public User(Context context){
        this.context= context;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    void onFabClicked(View v){
        Toast.makeText(context, "Clicked", Toast.LENGTH_SHORT).show();
    }
}
