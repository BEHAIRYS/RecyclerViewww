package com.example.recyclerview

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.recycler_view.view.*

class RecyclerAdapter : RecyclerView.Adapter() {
    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
val imageView : ImageView = itemView.imageView1
        val textView1 : TextView = itemView.textView1
        val textView2 : TextView = itemView.TextView2
    }
}