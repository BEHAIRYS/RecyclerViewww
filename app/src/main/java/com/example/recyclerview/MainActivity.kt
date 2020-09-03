package com.example.recyclerview.data


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.recyclerview.data.repository.MovieRepository
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.recycler_view.*

class MainActivity : AppCompatActivity(),MovieRepository.MovieCallback {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // val list :
        //recyclerView1.adapter= RecyclerAdapter(list)
        recyclerView1.layoutManager= LinearLayoutManager(this)
        recyclerView1.setHasFixedSize(true)
    }
    //to the recycler view activity
    fun bindMovieData(movieResults: MovieResults)
    {
        for (i in 0..movieResults.results.size)
        textView1.text = movieResults.results[i].toString()

        TextView2.text=movieResults.total_results.toString()
    }

    override fun movieResponse(movieResults: MovieResults)
    {
        bindMovieData(movieResults)
    }

   override fun movieResponseError(errorMessage:String)
    {
    }
}

//CONTRIBUTIONS:

/*
Ahmed Behairy: recycler_view.xml, activity_main.xml, Main Activity: recycler view part

Mostafa Shams: Retrofit with repository pattern including (MovieRepository.kt, MovieResults.kt, MovieDataInterface), MainActivity: networking part

Omar Ossman: RecyclerAdapter.kt, RecyclerView.kt

Farah Essam: Generating the api-key of the tmdb

Abdelrahman Shemis: Generating the url for the networking part using the api-key
 */