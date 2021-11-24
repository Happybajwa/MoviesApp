package com.example.moviesapp;

public class Movies {
    String year;
    String category;
    int description;
    int image;

    public Movies(String year, String category, int description, int image) {
        this.year = year;
        this.category = category;
        this.description = description;
        this.image = image;
    }

    public String getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public int getDescription() {
        return description;
    }

    public int getImage() {
        return image;
    }
}
