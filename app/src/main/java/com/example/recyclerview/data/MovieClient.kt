package com.example.recyclerview.data

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class MovieClient
{
    val base_url = "https://api.themoviedb.org/3/"
   // val page = 1
    val api_key = "51e5ef0f20f2f6bb99f099c714177163"
   // val language = "en-US"

    private val INSTANCE: MovieClient
        get() {
            return INSTANCE
        }


    var movieDataInterface: MovieDataInterface

    constructor(){
        val retrofit: Retrofit = Retrofit.Builder().baseUrl(base_url)
            .addConverterFactory(GsonConverterFactory.create()).build()

        movieDataInterface =retrofit.create(MovieDataInterface::class.java)
    }

    fun getMovies(): Call<MovieListResponse>
    {
        return movieDataInterface.getMovieData(api_key/*, language, page*/)
    }
    fun getMoviesTop(): Call<MovieListResponse>
    {
        return movieDataInterface.getMovieDataTop(api_key/*, language, page*/)
    }
}