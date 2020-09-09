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

        val exampleList = viewHolderList()
        recyclerView1.adapter= RecyclerAdapter(exampleList)
        recyclerView1.layoutManager= LinearLayoutManager(this)
        recyclerView1.setHasFixedSize(true)
    }

    val list = ArrayList<RecyclerView>()

    //to the recycler view activity
    fun bindMovieData(movieResults: MovieResults)
    {
            textView1.text = movieResults.title
            TextView2.text = movieResults.overview
            list.add(RecyclerView(textView1.text as String, TextView2.text as String))
    }

    override fun movieResponse(movieResults: MovieResults)
    {
        bindMovieData(movieResults)
    }


    override fun movieResponseError(errorMessage:String)
    {
    }

    fun viewHolderList(): List<RecyclerView>
    {
        return list
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