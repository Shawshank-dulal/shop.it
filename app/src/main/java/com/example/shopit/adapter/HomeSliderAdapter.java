package com.example.shopit.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.shopit.R;
import com.example.shopit.data.SliderCotent;
import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class HomeSliderAdapter  extends SliderViewAdapter<HomeSliderAdapter.ViewHolder>{

    private List<SliderCotent> sliderCotents;
    private int position;

    public HomeSliderAdapter() {
        this.sliderCotents = new ArrayList<>();
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_item,parent,false);

        return new ViewHolder(view);    }

    public void setSliderCotents(List<SliderCotent> sliderCotents) {
        this.sliderCotents = sliderCotents;
        this.notifyDataSetChanged();
    }



    @Override
    public int getCount() {
        return sliderCotents.size();
    }


    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        SliderCotent content=sliderCotents.get(position);
        position=position;
        holder.bindData(content);
    }



    class ViewHolder extends  SliderViewAdapter.ViewHolder{

        private TextView tvName,tvPrice;
        private ImageView ivImage;
        private RatingBar ratingBar;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            tvName=itemView.findViewById(R.id.tv_item_name);
            tvPrice=itemView.findViewById(R.id.tv_item_price);
            ivImage=itemView.findViewById(R.id.tv_item_image);

            ratingBar=itemView.findViewById(R.id.ratingBar);

        }

        public void bindData(SliderCotent sliderCotent){

            tvPrice.setText(String.valueOf(sliderCotent.getPrice()));
            tvName.setText(String.valueOf(sliderCotent.getName()));
            ivImage.setImageResource(sliderCotent.getImage());

            ratingBar.setRating(sliderCotent.getRating());

        }
    }
}
