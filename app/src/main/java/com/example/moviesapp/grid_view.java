package com.example.moviesapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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

//        if(movies.equals("Sci-fi")){
//            showScifiMovies();
//            getSupportActionBar().setTitle("Sci-fi Movies");
//        }

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

//
//    private void showScifiMovies(){
//        final ArrayList<Movies> sicfiMovies = new ArrayList<>();
//        sicfiMovies.add(new Movies("Christchurch Botanic Gardens", "Rolleston Ave, Christchurch City", R.string.chch_botanic_gardens_details, R.drawable.chch_botanic_gardens));
//        sicfiMovies.add(new Movies("Avon River", "Avon River, Canterbury", R.string.chch_avon_river_details, R.drawable.chch_avon_river));
//        sicfiMovies.add(new Movies("The Tranzalpine Train", "Christchurch Railway Station, Troup Drive", R.string.chch_tranzalpine_train_details, R.drawable.chch_tranzalpine_train));
//        sicfiMovies.add(new Movies("Awaroa/ Godley Head", "Sumner, Christchurch", R.string.chch_awaroa_details, R.drawable.chch_awaroa));
//        sicfiMovies.add(new Movies("Victoria Clock Tower", "95 Victoria Street, Christchurch Central", R.string.chch_victoria_clock_details, R.drawable.chch_victoria_clock_tower));
//        sicfiMovies.add(new Movies("Sumner Beach", "Sumner Beach, Canterbury", R.string.chch_sumner_beach_details, R.drawable.chch_sumner_beach));
//        sicfiMovies.add(new Movies("International Antarctic Centre", "38 Orchard Road, Christchurch", R.string.chch_antarctic_centre_details, R.drawable.chch_antarctic_centre));
//        sicfiMovies.add(new Movies("Christchurch Art Gallery", "Montreal Street, Christchurch", R.string.chch_art_gallery_details, R.drawable.chch_art_gallery));
//        sicfiMovies.add(new Movies("Willowbank Wildlife Reserve", "60 Hussey Road, Northwood", R.string.chch_willowbank_wildlife_details, R.drawable.chch_willowbank_wildlife));
//        sicfiMovies.add(new Movies("Christchurch Tramway", "109 Worcester Street, Christchurch Central", R.string.chch_tramway_details, R.drawable.chch_tramway));
//
//        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, attractionsChristchurch);
//
//        ListView listView = findViewById(R.id.attractionslist);
//        listView.setAdapter(listItemsAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Movies movie = sicfiMovies.get(position);
//                Intent i = new Intent(getBaseContext(), details.class);
//                i.putExtra("name",movie.getYear());
//                i.putExtra("image",movie.getImage());
//                i.putExtra("info", movie.getDescription());
//                startActivity(i);
//            }
//        });
//    }
//
//
//    private void showQueenstownAttractions(){
//        final ArrayList<Attraction> attractionsQueenstown = new ArrayList<>();
//        attractionsQueenstown.add(new Attraction("Bob's Peak & Skyline Gondola", "53 Brecon Street, Queenstown", R.string.qns_bobs_peak_details, R.drawable.qns_bobs_peak_skyline_gondola));
//        attractionsQueenstown.add(new Attraction("Queenstown Gardens", "Queenstown Gardens Disc Golf, Queenstown", R.string.qns_gardens_details, R.drawable.qns_gardens));
//        attractionsQueenstown.add(new Attraction("Lake Wakatipu", "Lake Wakatipu, Otago", R.string.qns_lake_wakatipu_details, R.drawable.qns_lake_wakatipu));
//        attractionsQueenstown.add(new Attraction("The Marine Parade", "Marine Parade, Queenstown", R.string.qns_marine_parade_details, R.drawable.qns_marine_parade));
//        attractionsQueenstown.add(new Attraction("Milford Sound", "Milford Sound, Fiordland National Park", R.string.qns_milford_details, R.drawable.qns_milford_sound));
//        attractionsQueenstown.add(new Attraction("Mount Aspiring National Park", "Mount Aspring National Park, New Zealand", R.string.qns_mt_aspriring_details, R.drawable.qns_mt_aspiring_national_park));
//        attractionsQueenstown.add(new Attraction("Nevis Valley", "Nevis Bungy, Gibbston", R.string.qns_nevis_valley_details, R.drawable.qns_nevis_valley));
//        attractionsQueenstown.add(new Attraction("Queenstown Hill", "58 Belfast Terrace, Queenstown", R.string.qns_queenstown_hill_details, R.drawable.qns_queenstown_hill));
//        attractionsQueenstown.add(new Attraction("Shotover River", "Shotover River, Otago", R.string.qns_shotover_river_details, R.drawable.qns_shotover_river));
//        attractionsQueenstown.add(new Attraction("Skippers Canyon", "Skippers Road, Queenstown", R.string.qns_skippers_canyon_details, R.drawable.qns_skippers_canyon));
//        attractionsQueenstown.add(new Attraction("The Remarkables", "The Remarkables Ski Area, Queenstown", R.string.qns_the_remarkables_details, R.drawable.qns_the_remarkables));
//
//        ListItemsAdapter listItemsAdapter = new ListItemsAdapter(this, attractionsQueenstown);
//
//        ListView listView = findViewById(R.id.attractionslist);
//        listView.setAdapter(listItemsAdapter);
//
//        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                Attraction attraction = attractionsQueenstown.get(position);
//                Intent i = new Intent(getBaseContext(), details.class);
//                i.putExtra("name",attraction.getName());
//                i.putExtra("image",attraction.getImage());
//                i.putExtra("info", attraction.getDescription());
//                startActivity(i);
//            }
//        });
//    }

}