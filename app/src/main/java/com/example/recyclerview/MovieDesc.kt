package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_movie_desc.*
import kotlinx.android.synthetic.main.activity_movie_desc.view.*

class MovieDesc : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_desc)
        movieOverviewDesc.text = intent.getStringExtra("movieOverview")
        textView_Overview.text="Overview:"

    }
}