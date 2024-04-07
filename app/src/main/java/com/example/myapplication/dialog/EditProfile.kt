package com.example.myapplication.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myapplication.R
import com.example.myapplication.data.AboutData
import com.example.myapplication.data.AthletesList
import com.example.myapplication.model.AthletesModel

class EditProfile: DialogFragment() {
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.edit_profile, null)

        // Initialize views
        val editTextAthleteName = view.findViewById<EditText>(R.id.editTextName)
        val editTextAthleteSport = view.findViewById<EditText>(R.id.editTextAboutme)

        val btnCancelAthlete = view.findViewById<TextView>(R.id.about_me_cancel)
        val btnAddAthlete = view.findViewById<TextView>(R.id.about_me_add)

        // Set click listener for cancel button
        btnCancelAthlete.setOnClickListener {
            dismiss()
        }

        // Set click listener for add button
        btnAddAthlete.setOnClickListener {
            val athleteName = editTextAthleteName.text.toString()
            val athleteSport = editTextAthleteSport.text.toString()
            AboutData.aboutData.name = athleteName
            AboutData.aboutData.desc = athleteSport
            dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        return builder.create()
    }

}