package com.example.myapplication.dialog

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.FragmentManager
import com.example.myapplication.R
import com.example.myapplication.data.NewsList.Companion.newsList
import com.example.myapplication.data.SportsList
import com.example.myapplication.model.NewsModel
import com.example.myapplication.model.SportsModel

class AddNewsDialogFragment : DialogFragment() {

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.add_news, null)

        // Initialize views
        val editTextNewsTitle = view.findViewById<EditText>(R.id.editTextNewsTitle)
        val editTextNewsImageUrl = view.findViewById<EditText>(R.id.editTextNewsImageUrl)
        val editTextNewsDescription =view.findViewById<EditText>(R.id.editTextNewsDescription)
        val btnCancel = view.findViewById<TextView>(R.id.news_btn_cancel)
        val btnAdd = view.findViewById<TextView>(R.id.news_btn_add)

        // Set click listener for cancel button
        btnCancel.setOnClickListener {
            dismiss()
        }

        // Set click listener for add button
        btnAdd.setOnClickListener {
            val editTextNewsTitle = editTextNewsTitle.text.toString()
            val editTextNewsImageUrl = editTextNewsImageUrl.text.toString()
            val editTextNewsDescription = editTextNewsDescription.text.toString()

            newsList.add(NewsModel(editTextNewsImageUrl, editTextNewsTitle,editTextNewsDescription))
            dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        return builder.create()
    }
}
