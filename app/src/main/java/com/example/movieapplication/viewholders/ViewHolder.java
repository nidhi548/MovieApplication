package com.example.movieapplication.viewholders;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.movieapplication.R;

import org.jetbrains.annotations.NotNull;

public class ViewHolder extends RecyclerView.ViewHolder {


        TextView textViewMovieName, textViewCategoryId;
        ImageView imageViewMovie;

        public ViewHolder(@NonNull @NotNull View itemView) {
            super(itemView);
            textViewMovieName = itemView.findViewById(R.id.textViewMovies);
            imageViewMovie = itemView.findViewById(R.id.imageViewMovies);

        }

}
