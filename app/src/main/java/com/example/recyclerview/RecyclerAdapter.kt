package com.example.recyclerview.data

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview.R
import kotlinx.android.synthetic.main.recycler_view.view.*

class RecyclerAdapter(private val list : List<com.example.recyclerview.data.RecyclerView>) : RecyclerView.Adapter<RecyclerAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.recycler_view,parent,
            false)
        return viewHolder(itemView)
    }



    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        val currentItem = list[position]
        holder.imageView.setImageResource(currentItem.imageResource)
        holder.textView1.text = currentItem.text1
        holder.textView2.text = currentItem.text2


    }
    override fun getItemCount()= list.size


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val imageView : ImageView = itemView.imageView1
        val textView1 : TextView = itemView.textView1
        val textView2 : TextView = itemView.TextView2
    }
}