package com.example.peliculas.Api;

import com.example.peliculas.Model.MoviesResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface Service {

    @GET("movie/popular")
    Call<MoviesResponse> getPopularMovies(@Query("apiKey") String key, @Query("page") int page);

}
