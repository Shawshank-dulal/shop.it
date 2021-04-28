package com.example.shopit.data;

public class SliderCotent {

    private int image;
    private  String name;
    private float price;
    private float rating;

    public SliderCotent(int image, String name, float price, float rating) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }
}
