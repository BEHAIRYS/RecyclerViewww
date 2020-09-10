package com.example.recyclerview.ui.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
import com.example.recyclerview.data.MovieResults
import com.example.recyclerview.data.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView1.layoutManager= LinearLayoutManager(this)
        recyclerView1.setHasFixedSize(true)

        val movieViewModel:MovieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
        movieViewModel.getMovies()

        movieViewModel.moviesMutableLiveData.observe(this, Observer { MovieResults->

            fun onChanged(movieResults: List<MovieResults>)
            {
                recyclerView1.adapter=RecyclerAdapter(movieResults)
            }
        })
    }

}