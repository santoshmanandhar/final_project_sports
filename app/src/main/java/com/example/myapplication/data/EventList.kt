package com.example.myapplication.data

import com.example.myapplication.model.EventModel
import com.example.myapplication.model.NewsModel

class EventList {
    companion object {
        // Initialize the newsList with default values
        val eventList = mutableListOf(
            EventModel(
                "Fifa world cup",
                "10/03/2033",
                "Description for news 1"
            ),
            EventModel(
                "FIBA basket ball",
                "10/10/2032",
                "Description for news 2"
            ),
            // Add more default news items as needed
        )
    }
}