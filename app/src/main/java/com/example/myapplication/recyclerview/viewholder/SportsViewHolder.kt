package com.example.myapplication.recyclerview.viewholder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R

class SportsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val titleTextView: TextView = itemView.findViewById(R.id.textViewTitle)
    val instructionsTextView: TextView = itemView.findViewById(R.id.textViewInstructions)
}
