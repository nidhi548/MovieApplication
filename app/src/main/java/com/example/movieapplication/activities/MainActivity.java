package com.example.movieapplication.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapplication.R;
import com.example.movieapplication.adapters.MoviesAdapter;
import com.example.movieapplication.app.Config;
import com.example.movieapplication.models.MovieList;
import com.example.movieapplication.models.Movies;
import com.example.movieapplication.viewholders.MoviesViewHolder;
import com.example.movieapplication.viewmodels.MainActivityViewModel;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    //    ImageSlider imageSlider;
    RecyclerView recyclerView;
    MoviesAdapter moviesAdapter;
    MovieList moviesList;
    Movies movies;
    ArrayList<Movies> movieArrayList = new ArrayList<>();
    private MainActivityViewModel mMainActivityViewModel;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        init();

    }

    private void init() {
        getdata();
//        mMainActivityViewModel = ViewModelProviders.of(this).get(MainActivityViewModel.class);
        recyclerView = findViewById(R.id.recyclerViewMovies);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        moviesAdapter = new MoviesAdapter(this, movieArrayList);
        recyclerView.setAdapter(moviesAdapter);
//        recyclerView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
    }

    private void getdata() {
        Retrofit retrofit;
        retrofit = new Retrofit.Builder()
                .baseUrl("https://api.themoviedb.org/4/list/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        MoviesViewHolder moviesViewHolder = retrofit.create(MoviesViewHolder.class);
        Call<MovieList> call = moviesViewHolder.getMoviesList("1", "1ac708dc9f83534a8053382fcb036d82");

        call.enqueue(new Callback<MovieList>() {
            @Override
            public void onResponse(Call<MovieList> call, Response<MovieList> response) {
                moviesList = response.body();
                Log.d("OneName", String.valueOf(moviesList.getResults().size()));
                movieArrayList.addAll(moviesList.getResults());
                moviesAdapter.setData(movieArrayList);
            }

            @Override
            public void onFailure(Call<MovieList> call, Throwable t) {
                Log.e("abc", t.toString());
                Toast.makeText(getApplicationContext(), t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });

    }
}