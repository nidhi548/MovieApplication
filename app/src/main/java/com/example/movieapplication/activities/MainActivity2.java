package com.example.movieapplication.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.movieapplication.R;

public class MainActivity2 extends AppCompatActivity {
    TextView tv_movie_name,tv_rating,tv_overview,tv_original_language,tv_release_date;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        init();
    }

    private void init() {
        Intent intent = getIntent();
        String movie_name = intent.getStringExtra("movie_name");
        String poster_path = intent.getStringExtra("poster_path");
        String rating = intent.getStringExtra("rating");
        String overview = intent.getStringExtra("overview");
        String release_date = intent.getStringExtra("release_date");
        String original_language = intent.getStringExtra("original_language");

        tv_movie_name = findViewById(R.id.tv_movie_name);
        tv_movie_name.setText(movie_name);
        tv_rating = findViewById(R.id.tv_rating);
        tv_rating.setText("Rating: "+rating);
        tv_overview = findViewById(R.id.tv_overview);
        tv_overview.setText("Overview: "+overview);
        tv_original_language = findViewById(R.id.tv_original_language);
        tv_original_language.setText("Original Language: " + original_language);
        tv_release_date = findViewById(R.id.tv_release_date);
        tv_release_date.setText("Release Date: "+release_date);
        imageView = findViewById(R.id.iv_movie_image);

        Glide.with(this)
                .load("https://image.tmdb.org/t/p/w500" + poster_path)
                .placeholder(R.drawable.piwo_48)
                .into(imageView);

    }
}