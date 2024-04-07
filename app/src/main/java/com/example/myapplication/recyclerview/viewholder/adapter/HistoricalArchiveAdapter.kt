package com.example.myapplication.recyclerview.viewholder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.EventModel
import com.example.myapplication.model.HistoricalArchiveModel
import com.example.myapplication.recyclerview.viewholder.EventViewHolder
import com.example.myapplication.recyclerview.viewholder.HistoricalArchiveViewHolder


class HistoricalArchiveAdapter(private val dataList: List<HistoricalArchiveModel>) : RecyclerView.Adapter<HistoricalArchiveViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HistoricalArchiveViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_historical_archives, parent, false)
        return HistoricalArchiveViewHolder(view)
    }

    override fun onBindViewHolder(holder: HistoricalArchiveViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.nameTextView.text = currentItem.name
        holder.date.text = currentItem.date
        holder.description.text = currentItem.description

    }

    override fun getItemCount() = dataList.size
}