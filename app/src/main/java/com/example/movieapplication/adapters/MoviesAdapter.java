package com.example.movieapplication.adapters;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.example.movieapplication.R;
import com.example.movieapplication.activities.MainActivity2;
import com.example.movieapplication.models.Movies;

import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.ViewHolder> {
    Context mContext;
    ArrayList<Movies> mList = new ArrayList<>();

    public MoviesAdapter(Context mContext, ArrayList<Movies> mList) {
        this.mContext = mContext;
        this.mList = mList;
    }

    public MoviesAdapter(Context mContext) {
        this.mContext = mContext;
    }


    @NotNull
    @Override
    public ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.movies_list, parent, false);
        return new ViewHolder(view);
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull @NotNull MoviesAdapter.ViewHolder holder, int position) {
        Movies movies = mList.get(position);
        Log.d("abc", movies.getOriginal_title());
        holder.textViewMoviesName.setText(movies.getOriginal_title());
        holder.textViewMoviesRating.setText(movies.getVote_average());
        ImageView ivPhoto;

        Glide.with(mContext)
                .load("https://image.tmdb.org/t/p/w500" + movies.getPoster_path())
                .placeholder(R.drawable.piwo_48)
                .into(holder.imageViewMovies);



        holder.imageViewMovies.setOnClickListener(v -> {
            Intent intent1 =  new Intent(mContext, MainActivity2.class);
            intent1.putExtra("movie_name",movies.getOriginal_title());
            intent1.putExtra("poster_path",movies.getPoster_path());
            intent1.putExtra("rating",movies.getVote_average());
            intent1.putExtra("overview",movies.getOverview());
            intent1.putExtra("release_date",movies.getRelease_date());
            intent1.putExtra("original_language",movies.getOriginal_language());
            mContext.startActivity(intent1);

        });
    }

    @Override
    public int getItemCount() {
        return mList.size();
    }

    public void setData(ArrayList<Movies> movieArrayList) {

        this.mList = movieArrayList;
        notifyDataSetChanged();
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewMoviesName, textViewMoviesRating;
        ImageView imageViewMovies;
        RecyclerView recyclerView;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewMoviesName = itemView.findViewById(R.id.textViewMovies);
            textViewMoviesRating = itemView.findViewById(R.id.textViewMoviesRating);
            imageViewMovies = itemView.findViewById(R.id.imageViewMovies);
            recyclerView = itemView.findViewById(R.id.recyclerViewMovies);
        }


    }
}
