package com.example.peliculas.Api;

import com.example.peliculas.Model.MoviesResponse;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class Client {

    public static final String BASE_URL = "https://api.themoviedb.org/3/";
    public static final String KEY = "73f867fd315199aa13c1ff91d2cd2879";
    public static Retrofit retrofit = null;
    Service service;

    public void init(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            System.out.println("Hola");
            service = retrofit.create(Service.class);
        }
    }

    public void getPopularMovies(){
        service.getPopularMovies("73f867fd315199aa13c1ff91d2cd2879",1)
                .enqueue(new Callback<MoviesResponse>() {
                    @Override
                    public void onResponse(Call<MoviesResponse> call, Response<MoviesResponse> response) {
                        if (!response.isSuccessful()){
                            System.out.println("Codigo ---- " + response.code());
                        }

                        MoviesResponse m = response.body();
                        System.out.println(m);
                    }

                    @Override
                    public void onFailure(Call<MoviesResponse> call, Throwable t) {
                        System.out.println(t.getMessage());
                    }
                });
    }

}
