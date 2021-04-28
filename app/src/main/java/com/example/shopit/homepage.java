package com.example.shopit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;


import com.example.shopit.adapter.HomeSliderAdapter;
import com.example.shopit.data.SliderCotent;
import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;
import java.util.List;

import static com.example.shopit.R.*;

public class homepage extends AppCompatActivity {

    SliderView sliderView;
    RecyclerView.LayoutManager layoutManager;
    HomeSliderAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(layout.activity_homepage);

        ArrayList<SliderCotent> sliderContents=new ArrayList<>();

        for(int i=0;i<5;i++)
            sliderContents.add(
                    new SliderCotent(
                    drawable.robot,
                    "Robot",
                    19.25f,
                    4.0f
            ));



        adapter=new HomeSliderAdapter();

        layoutManager=new LinearLayoutManager(this,RecyclerView.HORIZONTAL,false);
        sliderView=findViewById(id.imageSlider);

        sliderView.setSliderAdapter(adapter);


        adapter.setSliderCotents(sliderContents);


        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.startAutoCycle();
    }
}