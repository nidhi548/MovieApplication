package com.example.movieapplication.viewmodels;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.movieapplication.models.Movies;

import java.util.List;

public class MainActivityViewModel extends ViewModel {
    private MutableLiveData<List<Movies>> moviesMutableLiveData;

    public LiveData<List<Movies>> getMovies() {
        return moviesMutableLiveData;
    }
}
