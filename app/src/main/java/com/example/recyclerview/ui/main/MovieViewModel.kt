package com.example.recyclerview.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerview.data.MovieClient
import com.example.recyclerview.data.MovieListResponse
import com.example.recyclerview.data.MovieResults
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.reflect.KParameter

class MovieViewModel: ViewModel()
{
    val moviesMutableLiveData: MutableLiveData<List<MovieResults>> = MutableLiveData()
    val movieMutableList:MutableList<MovieResults> = ArrayList()

    fun getMovies()
    {
        var movieClient:MovieClient =MovieClient()
        movieClient.getMovies().enqueue(object : Callback<MovieListResponse>{
            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>
            ) {
                if(response!=null)
                {
                    println("response not equal null")
                    if(!(response.isSuccessful))
                    {
                        println("connection not successful")
                    }
                }
                val tempList: List<MovieResults> = response.body()?.results ?: listOf()
                movieMutableList.clear()
                movieMutableList.addAll(tempList)
                moviesMutableLiveData.postValue(movieMutableList)
                println(response.body()?.results)
            }

            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                println("error")
            }

        })
    }
    fun getMoviesTop()
    {
        var movieClient:MovieClient =MovieClient()
        movieClient.getMoviesTop().enqueue(object : Callback<MovieListResponse>{
            override fun onResponse(
                call: Call<MovieListResponse>,
                response: Response<MovieListResponse>
            ) {
                if(response!=null)
                {
                    println("response not equal null")
                    if(!(response.isSuccessful))
                    {
                        println("connection not successful")
                    }
                }
                val tempList: List<MovieResults> = response.body()?.results ?: listOf()
                movieMutableList.clear()
                movieMutableList.addAll(tempList)
                moviesMutableLiveData.postValue(movieMutableList)
                println(response.body()?.results)
            }

            override fun onFailure(call: Call<MovieListResponse>, t: Throwable) {
                println("error")
            }

        })
    }
}