package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickAnimation(View view) {
        Intent categoryListActivity = new Intent(this, grid_view.class);
        categoryListActivity.putExtra("category", "animation");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void onClickSuperHero(View view) {
        Intent categoryListActivity = new Intent(this, grid_view.class);
        categoryListActivity.putExtra("category", "superhero");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }

    public void onClickScifi(View view) {
        Intent categoryListActivity = new Intent(this, grid_view.class);
        categoryListActivity.putExtra("category", "christchurch");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }


}