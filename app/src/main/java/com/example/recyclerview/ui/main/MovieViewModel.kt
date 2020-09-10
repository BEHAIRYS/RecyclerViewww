package com.example.recyclerview.ui.main

import android.app.Application
import androidx.annotation.NonNull
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerview.MovieRepository
import com.example.recyclerview.Movies
import com.example.recyclerview.data.MovieClient
import com.example.recyclerview.data.MovieResults
import org.jetbrains.annotations.NonNls
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.reflect.KParameter

class MovieViewModel: ViewModel
{
    lateinit var repository: MovieRepository

    lateinit var allMovies : LiveData<List<Movies>>


    val moviesMutableLiveData: MutableLiveData<List<MovieResults>>
        get() = moviesMutableLiveData

    constructor(@NonNull application: Application) : super()
    {

        repository= MovieRepository(application)
        allMovies=repository.allMovies

    }
    public fun insert(movie: Movies) {
        repository.insert(movie)
    }
    public fun update(movie: Movies)
    {
        repository.update(movie)
    }
    public fun delete(movie: Movies)
    {
        repository.delete(movie)
    }
    public fun deleteAll(movie: Movies)
    {
        repository.deleteAllMovies(movie)
    }


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