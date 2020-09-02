package com.example.recyclerview

import android.provider.DocumentsContract
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view.view.*

class RecyclerAdapter : RecyclerView.Adapter<RecyclerAdapter.viewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.recycler_view,parent,
            false)
        return viewHolder(itemView)
    }



    override fun onBindViewHolder(holder: viewHolder, position: Int) {
        TODO("Not yet implemented")
    }
    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
val imageView : ImageView = itemView.imageView1
        val textView1 : TextView = itemView.textView1
        val textView2 : TextView = itemView.TextView2
    }
}