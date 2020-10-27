package com.example.peliculas.Model;

import com.google.gson.annotations.SerializedName;

public class Movie {

    @SerializedName("id")
    private Long id;
    @SerializedName("title")
    private String title;
    @SerializedName("overview")
    private String overview;
    @SerializedName("poster_path")
    private String posterPath;
    @SerializedName("backdrop_path")
    private String backdropPath;
    @SerializedName("vote_average")
    private float rating;
    @SerializedName("release_date")
    private String releaseDate;

}
