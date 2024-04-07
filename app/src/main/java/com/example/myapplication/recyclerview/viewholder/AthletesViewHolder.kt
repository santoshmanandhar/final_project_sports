package com.example.myapplication.recyclerview.viewholder

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.AthletesModel

class AthletesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
     val nameTextView: TextView = itemView.findViewById(R.id.nameid)
     val sportTextView: TextView = itemView.findViewById(R.id.sportid)
     val countryTextView: TextView = itemView.findViewById(R.id.countryid)
     val personalBestTextView: TextView = itemView.findViewById(R.id.personalBestid)
     val factsTextView: TextView = itemView.findViewById(R.id.factsid)

}