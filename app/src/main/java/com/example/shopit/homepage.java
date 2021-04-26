package com.example.shopit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import static com.example.shopit.R.*;
import static com.example.shopit.R.id.bottom_navigation;

public class homepage extends AppCompatActivity implements MenuListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_homepage);
    }


    @Override
    public void onNavigationItemSelected(MenuItem item) {
        Toast toast = Toast.makeText(getApplicationContext(), "item.getItemId()", Toast.LENGTH_SHORT);
        toast.show();

//        switch (item.getItemId()){
//            case getString(home):
//                Intent homepage=new Intent(com.example.shopit.homepage.this, com.example.shopit.homepage.class);
//
//
//            default:
//                throw new IllegalStateException("Unexpected value: " + item);
//        }
//    }
}
}