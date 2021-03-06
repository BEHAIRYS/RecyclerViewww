package com.example.recyclerview.data

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface MovieDataInterface
{
    @GET(value = "3/movie/popular")
    fun getMovieData(
        @Query("api_key") api_key:String,
        @Query("language") language:String = "en",
        @Query("page") page: Int
    ):Call<List<MovieResults>>


    // https://api.themoviedb.org/3/movie/popular?api_key=51e5ef0f20f2f6bb99f099c714177163&language=en-US&page=1
}