package com.example.movieapplication.models;

import android.graphics.Movie;

import com.example.movieapplication.models.Movies;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public class MovieList {
    private ArrayList<Movies> results;

    public MovieList(ArrayList<Movies> results) {
        this.results = results;
    }

    public ArrayList<Movies> getResults() {
        return results;
    }

    public void setResults(ArrayList<Movies> results) {
        this.results = results;
    }

}
