package com.example.movieapplication.viewholders;

import com.example.movieapplication.models.MovieList;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface MoviesViewHolder {
    @GET("1?")
//?page=1&api_key=1ac708dc9f83534a8053382fcb036d82/")
    Call<MovieList> getMoviesList(@Query("page") String Page, @Query("api_key") String APIKey);
}
