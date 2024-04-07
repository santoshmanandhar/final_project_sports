package com.example.myapplication.recyclerview.viewholder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.SportsModel
import com.example.myapplication.recyclerview.viewholder.SportsViewHolder

class SportsAdapter(private val sportsList: List<SportsModel>) : RecyclerView.Adapter<SportsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SportsViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.card_sports, parent, false)
        return SportsViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: SportsViewHolder, position: Int) {
        val currentItem = sportsList[position]
        holder.titleTextView.text = currentItem.title
        holder.instructionsTextView.text = currentItem.instructions
    }

    override fun getItemCount() = sportsList.size
}
