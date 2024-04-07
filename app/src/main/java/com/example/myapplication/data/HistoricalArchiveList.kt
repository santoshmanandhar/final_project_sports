package com.example.myapplication.data;

import com.example.myapplication.model.HistoricalArchiveModel

class HistoricalArchiveList {
    companion object {
        // Initialize the newsList with default values
        val historicalAdapterList = mutableListOf(
                HistoricalArchiveModel(
                        "Fifa world cup",
                        "10/03/2033",
                        "Description for news 1"
                ),
            HistoricalArchiveModel(
                        "FIBA basket ball",
                        "10/10/2032",
                        "Description for news 2"
                ),
                // Add more default news items as needed
        )
    }
}