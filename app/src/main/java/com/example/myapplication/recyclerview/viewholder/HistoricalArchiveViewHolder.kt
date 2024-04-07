package com.example.myapplication.recyclerview.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R


class HistoricalArchiveViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val nameTextView: TextView = itemView.findViewById(R.id.historical_name)
    val description: TextView = itemView.findViewById(R.id.historical_description)
    val date: TextView = itemView.findViewById(R.id.historical_date)

}