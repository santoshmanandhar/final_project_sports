package com.example.myapplication.data

import com.example.myapplication.model.SportsModel

class SportsList {
    companion object {
        // Initialize the sportsList as an empty mutable list
        val sportsList = mutableListOf(
            SportsModel("Football", "Instructions for football"),
            SportsModel("Basketball", "Instructions for basketball"),
            SportsModel("Tennis", "Instructions for tennis"),
            SportsModel("Cricket", "Instructions for cricket"),
            SportsModel("Swimming", "Instructions for swimming"),
            SportsModel("Running", "Instructions for running")
        )
    }
}
