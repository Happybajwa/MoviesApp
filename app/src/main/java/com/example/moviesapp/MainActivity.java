package com.example.moviesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // calling the action bar
        ActionBar actionBar = getSupportActionBar();

        // showing the back button in action bar
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    // this event will enable the back
    // function to the button on press
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
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
        categoryListActivity.putExtra("category", "Sci-fi");
        startActivity(categoryListActivity, ActivityOptions.makeSceneTransitionAnimation(this).toBundle());
    }


}