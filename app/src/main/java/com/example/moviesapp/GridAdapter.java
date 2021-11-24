package com.example.moviesapp;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class GridAdapter extends ArrayAdapter<Movies> {
    public GridAdapter(Activity context, ArrayList<Movies> movies) {
        super(context, 0, movies);
    }

        public View getView(int position, View convertView, ViewGroup parent) {
            View gridView = convertView;
            if(gridView == null){
                gridView = LayoutInflater.from(getContext()).inflate(
                        R.layout.activity_list_item_view,parent,false);
            }

            Movies movie = getItem(position);

//            TextView movieYear = gridView.findViewById(R.id.list_item_text);
//            String year = movie.getYear();
//            movieYear.setText(year);
//
//            TextView category = gridView.findViewById(R.id.list_item_text2);
//            category.setText(movie.getCategory());

            ImageView image = gridView.findViewById(R.id.list_image);
            image.setImageResource(movie.getImage());

            return gridView;
    }
}
