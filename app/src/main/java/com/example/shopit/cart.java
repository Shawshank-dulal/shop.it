package com.example.shopit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

import com.google.android.material.navigation.NavigationView;

public class cart extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
    }
    public void addDeleteButton(View view){
        RelativeLayout cart_layout= (RelativeLayout) findViewById(R.id.cart_layout);
        Button delete=new Button(this);
        delete.setText("Delete");
        cart_layout.addView(delete);
    }

}