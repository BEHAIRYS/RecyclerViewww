package com.example.recyclerview.ui.main


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.replace
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.Favorites
import com.example.recyclerview.PopularMovies
import com.example.recyclerview.R
import com.example.recyclerview.TopRatedMovies
import com.example.recyclerview.data.MovieResults
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_popular_movies.*

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val popularFragment = PopularMovies()
        val topRatedMoviesFragment = TopRatedMovies()
        val favorites = Favorites()

        bottomNavigationView.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.popularMovies->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, popularFragment).commit()
                }
                R.id.topRatedMovies->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, topRatedMoviesFragment).commit()
                }
                R.id.favorites->{
                    supportFragmentManager.beginTransaction().replace(R.id.fragment, favorites).commit()
                }
            }
            true
        }
    }


}