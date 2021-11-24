package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class details extends AppCompatActivity {
    String year;
    int image;
    int details;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        TextView nameTextView = (TextView) findViewById(R.id.detailsTitle);
        ImageView imageView = (ImageView) findViewById(R.id.detailsImage);
        TextView detailsTextView = (TextView) findViewById(R.id.detailsText);

        Intent intent = getIntent();
        year = intent.getStringExtra("year");
        image = intent.getIntExtra("image", 0);
        details = intent.getIntExtra("info", 0);

        nameTextView.setText(year);
        imageView.setImageResource(image);
        detailsTextView.setText(details);
    }
}