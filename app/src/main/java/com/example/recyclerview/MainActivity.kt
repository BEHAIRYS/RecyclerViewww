package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task4_movies.data.MovieResults
import com.example.task4_movies.data.repository.MovieRepository

class MainActivity : AppCompatActivity(), MovieRepository.MovieCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    //to the recycler view activity
    fun bindMovieData(movieResults: MovieResults)
    {

    }

    override fun movieResponse(movieResults: MovieResults)
    {
        bindMovieData(movieResults)
    }

    override fun movieResponseError(errorMessage:String)
    {

    }
}