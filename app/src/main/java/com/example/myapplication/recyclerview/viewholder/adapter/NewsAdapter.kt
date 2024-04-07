package com.example.myapplication.recyclerview.viewholder.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.myapplication.R
import com.example.myapplication.model.NewsModel
import com.example.myapplication.recyclerview.viewholder.NewsViewHolder

class NewsAdapter(private val dataList: List<NewsModel>) : RecyclerView.Adapter<NewsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.news_layout, parent, false)
        return NewsViewHolder(view)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {
        val currentItem = dataList[position]

        // Load image using Glide
        Glide.with(holder.itemView)
            .load(currentItem.image)
            .centerCrop() // Center-crop the image to fill the ImageView
            .into(holder.imageView)


        holder.titleTextView.text = currentItem.title
        holder.descriptionTextView.text = currentItem.description
    }

    override fun getItemCount() = dataList.size
}
