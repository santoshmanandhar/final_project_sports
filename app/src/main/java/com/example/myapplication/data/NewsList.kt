package com.example.myapplication.data

import com.example.myapplication.model.NewsModel
import com.example.myapplication.model.SportsModel

class NewsList {
    companion object {
        // Initialize the newsList with default values
        val newsList = mutableListOf(
            NewsModel(
                "https://mediacdn.mancity.com/cf/media/f1gitwqo/kevin-de-bruyne-contract-april-2021-career-gallery.jpg",
                "News Title 1",
                "Description for news 1"
            ),
            NewsModel(
                "https://i.ytimg.com/vi/HWhWDau5SPg/maxresdefault.jpg",
                "News Title 2",
                "Description for news 2"
            ),
            // Add more default news items as needed
        )
    }
}
