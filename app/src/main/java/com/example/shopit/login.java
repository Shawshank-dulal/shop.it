package com.example.shopit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void switchToHomepage(View view) {
        Intent homepage=new Intent(login.this, com.example.shopit.homepage.class);
        startActivity(homepage);
    }
}