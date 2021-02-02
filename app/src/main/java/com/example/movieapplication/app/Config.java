package com.example.movieapplication.app;

import com.example.movieapplication.models.Movies;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Config {

//    public static final String BASE_URL = "https://api.themoviedb.org/4/list/1?page=1&api_key=1ac708dc9f83534a8053382fcb036d82/";
//    https://api.themoviedb.org/4/list/1?page=1&api_key=1ac708dc9f83534a8053382fcb036d82
//    public static final String IMAGE_URL = "https://image.tmdb.org/t/p/w500";

//    @GET("Music")
//    Call<Movies.MovieList> getMovieList();

    public static final String BASE_URL = "https://api.themoviedb.org/4/list/";
    public final static String key = "1ac708dc9f83534a8053382fcb036d82";
//   @GET("1?page=1&api_key="+key)
////    @GET("comments")
//   Call<List<Movies>> getMovies();
}
