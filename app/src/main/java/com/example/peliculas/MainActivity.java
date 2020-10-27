package com.example.peliculas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.peliculas.Api.Client;
import com.example.peliculas.Model.Movie;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private TextView text;
    private List<Movie> movies;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text = findViewById(R.id.text);

        Client client = new Client();
        client.init();
        client.getPopularMovies();
    }


    }


