package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class welcome extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Animation animation;
        ImageView image;
        TextView text;

        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcome);

        animation = AnimationUtils.loadAnimation(this, R.anim.welcome_animation);

        image = findViewById(R.id.welcome);
        text = findViewById(R.id.logotext);

        image.setAnimation(animation);
        text.setAnimation(animation);
    }
}