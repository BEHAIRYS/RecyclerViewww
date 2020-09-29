package com.example.recyclerview

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.example.recyclerview.data.MovieResults
import com.example.recyclerview.ui.main.MovieViewModel
import com.example.recyclerview.ui.main.RecyclerAdapter
import kotlinx.android.synthetic.main.fragment_popular_movies.*

class PopularMovies : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_popular_movies, container, false)
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val movieViewModel: MovieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movieViewModel.getMovies()

        movieViewModel.moviesMutableLiveData.observe(viewLifecycleOwner, Observer<List<MovieResults>> {

           rv.adapter = RecyclerAdapter(it)
        })
    }


}