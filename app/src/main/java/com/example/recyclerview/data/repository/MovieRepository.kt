package com.example.recyclerview.data.repository

import com.example.recyclerview.data.MovieDataInterface
import com.example.recyclerview.data.MovieResults
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

//UNUSED

/*
object MovieRepository
{

    fun movieRequests(movieResults: MovieResults) {
        CALL.enqueue(object : Callback<MovieResults> {
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
}*/