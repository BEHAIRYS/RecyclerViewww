package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.task4_movies.data.MovieResults
import com.example.task4_movies.data.repository.MovieRepository
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //to the recycler view activity
    fun bindMovieData(movieResults: MovieResults)
    {

    }

    override fun movieResponse(movieResults: MovieResults)
    {
        bindMovieData(movieResults)
    }

    override fun movieResponseError(errorMessage:String)
    {

        // val list :
        recyclerView1.adapter= RecyclerAdapter(list)
        recyclerView1.layoutManager= LinearLayoutManager(this)
        recyclerView1.setHasFixedSize(true)

    }
}