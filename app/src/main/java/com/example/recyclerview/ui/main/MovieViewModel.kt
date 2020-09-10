package com.example.recyclerview.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.recyclerview.data.MovieResults

class MovieViewModel: ViewModel()
{
    private val moviesMutableLiveData: MutableLiveData<List<MovieResults>>
        get() = moviesMutableLiveData

    fun getMovies(){}
}