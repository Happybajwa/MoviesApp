package com.example.moviesapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ListView;

import java.util.ArrayList;

public class grid_view extends AppCompatActivity {
String movies;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_grid_view);

        Intent intent = getIntent();

        movies = intent.getStringExtra("category");

        if(movies.equals("animation")){
            showAnimationMovies();
            getSupportActionBar().setTitle("Animation Movies");
        }

        if(movies.equals("superhero")){
            showSuperheroMovies();
            getSupportActionBar().setTitle("Superhero Movies");
        }

        if(movies.equals("Sci-fi")){
            showScifiMovies();
            getSupportActionBar().setTitle("Sci-fi Movies");
        }

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

    private void showAnimationMovies(){
        final ArrayList<Movies> animationMovies = new ArrayList<>();
        animationMovies.add(new Movies("Toy Story 3 2010", "Animation", R.string.toy_stroy_3, R.drawable.tstory));
        animationMovies.add(new Movies("Toy Story 1995", "Animation, City Center", R.string.toy_stroy, R.drawable.toy_story));
        animationMovies.add(new Movies("The Nightmare Before Christmas 1993", "Animation", R.string.nightmare, R.drawable.nightmare));
        animationMovies.add(new Movies("Dragon 2010", "Animation", R.string.dragon, R.drawable.dragon));
        animationMovies.add(new Movies("The Lion King 2010", "Animation", R.string.lionking, R.drawable.lion_king));
        animationMovies.add(new Movies("lilo Snitch 2002", "Animation", R.string.lilo, R.drawable.lilo));
        animationMovies.add(new Movies("The Ratatouille 2007", "Animation", R.string.rat, R.drawable.the_rat));
        animationMovies.add(new Movies("Carolina 2009", "Animation", R.string.caroline, R.drawable.carolina));
        animationMovies.add(new Movies("Up 2009", "Animation", R.string.up, R.drawable.up));
        animationMovies.add(new Movies("Wall-E 2008", "Animation", R.string.wall, R.drawable.wall));

        GridAdapter listItemsAdapter = new GridAdapter(this, animationMovies);

        GridView gridView = findViewById(R.id.moviesList);
        gridView.setAdapter(listItemsAdapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Movies movie = animationMovies.get(position);
            Intent i = new Intent(getBaseContext(), details.class);
            i.putExtra("year",movie.getYear());
            i.putExtra("image",movie.getImage());
            i.putExtra("info", movie.getDescription());
            startActivity(i);
        });
    }


    private void showSuperheroMovies(){
        final ArrayList<Movies> superheroMovies = new ArrayList<>();
        superheroMovies.add(new Movies("The Dark Knight 2008", "Superhero", R.string.darkknight, R.drawable.dark_knight));
        superheroMovies.add(new Movies("The Legend 2012", "Superhero", R.string.thelegend, R.drawable.the_legend));
        superheroMovies.add(new Movies("The Gardian of Galaxy 2014", "Superhero", R.string.thegardian, R.drawable.gardianofgalaxy));
        superheroMovies.add(new Movies("Iron Man 2008", "Superhero", R.string.ironman, R.drawable.ironman));
        superheroMovies.add(new Movies("Captain America 2014", "Superhero", R.string.captain, R.drawable.captainamerica));
        superheroMovies.add(new Movies("Spiderman 3 2007", "Superhero", R.string.spideerman, R.drawable.spiderman_3));
        superheroMovies.add(new Movies("The Wolerine 2013", "Superhero", R.string.wolverine, R.drawable.wolverine));
        superheroMovies.add(new Movies("Batman 2005", "Superhero", R.string.batman, R.drawable.batman));
        superheroMovies.add(new Movies("Man of Steel 2013", "Superhero", R.string.manofsteel, R.drawable.manofsteel));
        superheroMovies.add(new Movies("Thor 2013", "Superhero", R.string.thor, R.drawable.thor));

        GridAdapter listItemsAdapter = new GridAdapter(this, superheroMovies);

        GridView gridView = findViewById(R.id.moviesList);
        gridView.setAdapter(listItemsAdapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Movies movie = superheroMovies.get(position);
            Intent i = new Intent(getBaseContext(), details.class);
            i.putExtra("year",movie.getYear());
            i.putExtra("image",movie.getImage());
            i.putExtra("info", movie.getDescription());
            startActivity(i);
        });
    }

    private void showScifiMovies(){
        final ArrayList<Movies> sicfiMovies = new ArrayList<>();
        sicfiMovies.add(new Movies("Another Earth 2013", "SCI-FI", R.string.Anotherearth, R.drawable.anotherearth));
        sicfiMovies.add(new Movies("Argo 2012", "SCI-FI", R.string.argo, R.drawable.argo));
        sicfiMovies.add(new Movies("Cloverfield 2008", "SCI-FI", R.string.cloverfield, R.drawable.cloverfield));
        sicfiMovies.add(new Movies("Finch 2021", "SCI-FI", R.string.finch, R.drawable.finch));
        sicfiMovies.add(new Movies("Interstellar 2014", "SCI-FI", R.string.insterstaller, R.drawable.interstaller));
        sicfiMovies.add(new Movies("Lucy 2014", "SCI-FI", R.string.lucy, R.drawable.lucy));
        sicfiMovies.add(new Movies("Prometheus 2012", "SCI-FI", R.string.promethus, R.drawable.prometheus));
        sicfiMovies.add(new Movies("Star Wars 2004", "SCI-FI", R.string.startwars, R.drawable.startwars));
        sicfiMovies.add(new Movies("The Tomorrow War 2021", "SCI-FI", R.string.tomorrowwar, R.drawable.tommorowwar));
        sicfiMovies.add(new Movies("Tron 2021", "SCI-FI", R.string.tron, R.drawable.tron));

        GridAdapter listItemsAdapter = new GridAdapter(this, sicfiMovies);

        GridView gridView = findViewById(R.id.moviesList);
        gridView.setAdapter(listItemsAdapter);

        gridView.setOnItemClickListener((parent, view, position, id) -> {
            Movies movie = sicfiMovies.get(position);
            Intent i = new Intent(getBaseContext(), details.class);
            i.putExtra("year",movie.getYear());
            i.putExtra("image",movie.getImage());
            i.putExtra("info", movie.getDescription());
            startActivity(i);

            });
        }
    }
