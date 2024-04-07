package com.example.myapplication.recyclerview.viewholder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class NewsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val imageView: ImageView = itemView.findViewById(R.id.imageView)
    val titleTextView: TextView = itemView.findViewById(R.id.titleTextView)
    val descriptionTextView: TextView = itemView.findViewById(R.id.descriptionTextView)
}
