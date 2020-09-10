package com.example.recyclerview.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerview.data.MovieClient
import com.example.recyclerview.data.MovieResults
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.reflect.KParameter

class MovieViewModel: ViewModel()
{
     val moviesMutableLiveData: MutableLiveData<List<MovieResults>>
        get() = moviesMutableLiveData

    fun getMovies()
    {
        lateinit var movieClient:MovieClient
        movieClient.getMovies().enqueue(object : Callback<List<MovieResults>>{
            override fun onResponse(
                call: Call<List<MovieResults>>,
                response: Response<List<MovieResults>>
            ) {
                moviesMutableLiveData.value=response.body()
            }

            override fun onFailure(call: Call<List<MovieResults>>, t: Throwable) {
                println("error")
            }

        })
    }
}