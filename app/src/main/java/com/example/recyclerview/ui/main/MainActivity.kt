package com.example.recyclerview.ui.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.R
import com.example.recyclerview.data.RecyclerAdapter
import com.example.recyclerview.data.RecyclerView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(){


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val exampleList = viewHolderList()
        recyclerView1.adapter= RecyclerAdapter(exampleList)
        recyclerView1.layoutManager= LinearLayoutManager(this)
        recyclerView1.setHasFixedSize(true)

        val movieViewModel:MovieViewModel = ViewModelProviders.of(this).get(MovieViewModel::class.java)
    }

    val list = ArrayList<RecyclerView>()

   /* override fun movieResponse(movieResults: MovieResults)
    {
        bindMovieData(movieResults)
    }


    override fun movieResponseError(errorMessage:String)
    {
    }*/

    fun viewHolderList(): List<RecyclerView>
    {
        return list
    }
}