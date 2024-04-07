package com.example.myapplication.data

import com.example.myapplication.model.AthletesModel
import com.example.myapplication.model.NewsModel

class AthletesList {
    companion object {
            val athletesList = mutableListOf(
                AthletesModel(
                    "Usain Bolt",
                    "Athletics",
                    "Jamaica",
                    "9.58 seconds (100m)",
                    "Won 8 Olympic gold medals"
                ),

                AthletesModel(
                    "Cristiano Ronaldo",
                    "Football",
                    "Portugal",
                    "5 FIFA Ballon d'Or awards",
                    "One of the greatest footballers of all time"
                )
            )
}}