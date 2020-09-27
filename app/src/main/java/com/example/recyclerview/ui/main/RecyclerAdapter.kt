package com.example.recyclerview.ui.main

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.MovieDesc
import com.example.recyclerview.R
import com.example.recyclerview.data.MovieResults
import kotlinx.android.synthetic.main.recycler_view_item.view.*

class RecyclerAdapter(private val list : List<MovieResults>) : RecyclerView.Adapter<RecyclerAdapter.viewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.recycler_view_item,parent,
            false)
        return viewHolder(itemView)
    }


    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = list[position]

        holder.textView1.text = currentItem.title
        holder.textView2.text = currentItem.overview
        holder.itemData = currentItem
    }

    override fun getItemCount()= list.size


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val textView1 : TextView = itemView.textView1
        val textView2 : TextView = itemView.TextView2
        var itemData: MovieResults? = null

        init {
            itemView.setOnClickListener {
                val i = Intent(itemView.context,MovieDesc::class.java)
                i.putExtra("movieTitle",itemData?.title)

                itemView.context.startActivity(i)
            }
        }
    }
}