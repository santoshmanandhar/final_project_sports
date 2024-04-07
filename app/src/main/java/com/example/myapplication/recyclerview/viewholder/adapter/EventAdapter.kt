package com.example.myapplication.recyclerview.viewholder.adapter

import android.media.metrics.Event
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.R
import com.example.myapplication.model.AthletesModel
import com.example.myapplication.model.EventModel
import com.example.myapplication.recyclerview.viewholder.AthletesViewHolder
import com.example.myapplication.recyclerview.viewholder.EventViewHolder


class EventAdapter(private val dataList: List<EventModel>) : RecyclerView.Adapter<EventViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EventViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_events, parent, false)
        return EventViewHolder(view)
    }

    override fun onBindViewHolder(holder: EventViewHolder, position: Int) {
        val currentItem = dataList[position]
        holder.nameTextView.text = currentItem.name
        holder.date.text = currentItem.date
        holder.description.text = currentItem.description

    }

    override fun getItemCount() = dataList.size
}
