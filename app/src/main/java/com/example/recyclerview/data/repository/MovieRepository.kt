package com.example.recyclerview.data.repository

import com.example.recyclerview.data.MovieDataInterface
import com.example.recyclerview.data.MovieResults
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object MovieRepository
{
    val base_url = "https://api.themoviedb.org/"
    val page = 1
    val api_key = "51e5ef0f20f2f6bb99f099c714177163"
    val language = "en-US"

    val retrofit: Retrofit = Retrofit.Builder().baseUrl(base_url)
        .addConverterFactory(GsonConverterFactory.create()).build()

    val apiInterface: MovieDataInterface = retrofit.create(MovieDataInterface::class.java)
    val call: Call<MovieResults> = apiInterface.getMovieData(api_key, language, page)


    fun movieRequests(movieResults: MovieResults) {
        call.enqueue(object : Callback<MovieResults> {
            override fun onResponse(call: Call<MovieResults>, response: Response<MovieResults>) {
                println("call successful")
            }

            override fun onFailure(call: Call<MovieResults>, t: Throwable) {
                println("call failed")
            }

        })
    }

    interface MovieCallback
    {
        fun movieResponse(movieResults: MovieResults)
        fun movieResponseError(errorMessage:String)
    }
}