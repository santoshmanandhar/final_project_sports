package com.example.myapplication.recyclerview.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class EventViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nameTextView: TextView = itemView.findViewById(R.id.name)
    val description: TextView = itemView.findViewById(R.id.descriptionTextView)
    val date: TextView = itemView.findViewById(R.id.date)

}