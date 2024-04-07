package com.example.myapplication.recyclerview.viewholder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.AthletesModel
import com.example.myapplication.recyclerview.viewholder.AthletesViewHolder
import com.example.myapplication.recyclerview.viewholder.NewsViewHolder


class AthletesAdapter(private val dataList: List<AthletesModel>) : RecyclerView.Adapter<AthletesViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AthletesViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_athletes, parent, false)
        return AthletesViewHolder(view)
    }

    override fun onBindViewHolder(holder: AthletesViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.nameTextView.text = currentItem.name
        holder.sportTextView.text = currentItem.sport
        holder.countryTextView.text = currentItem.country
        holder.personalBestTextView.text = currentItem.personalBest
        holder.factsTextView.text = currentItem.facts

    }

    override fun getItemCount() = dataList.size
}
