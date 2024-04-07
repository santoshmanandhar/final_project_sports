package com.example.myapplication.dialog

import android.app.DatePickerDialog
import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.DatePicker
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.DialogFragment
import com.example.myapplication.R
import com.example.myapplication.data.HistoricalArchiveList
import com.example.myapplication.model.HistoricalArchiveModel
import com.example.myapplication.recyclerview.viewholder.adapter.HistoricalArchiveAdapter
import java.util.Calendar

class AddHistoricalArchivesDialog(private val adapter: HistoricalArchiveAdapter) : DialogFragment() {
    private lateinit var dateSetListener: DatePickerDialog.OnDateSetListener
    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val inflater = LayoutInflater.from(requireContext())
        val view = inflater.inflate(R.layout.add_historical_event, null)

        // Initialize views
        val editTextAthleteName = view.findViewById<EditText>(R.id.editTextAthleteName)
        val editTextAthleteSport = view.findViewById<EditText>(R.id.editTextAthleteSport)
        val editTextAthleteCountry = view.findViewById<EditText>(R.id.editTextAthleteCountry)
        val btnCancelAthlete = view.findViewById<TextView>(R.id.historical_btn_cancel)
        val btnAddAthlete = view.findViewById<TextView>(R.id.historical_btn_add)

        dateSetListener = DatePickerDialog.OnDateSetListener { _: DatePicker, year: Int, month: Int, dayOfMonth: Int ->
            // Update the selected date text view when the user selects a date
            val selectedDate = "$dayOfMonth/${month + 1}/$year"
            editTextAthleteSport.setText(selectedDate)
        }
        editTextAthleteSport.onFocusChangeListener = View.OnFocusChangeListener { _, hasFocus ->
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

            // Create DatePickerDialog and show it
            val datePickerDialog = context?.let { it1 ->

                DatePickerDialog(
                    it1,
                    dateSetListener,
                    year,
                    month,
                    dayOfMonth
                )
            }
            datePickerDialog?.show()
        }
        editTextAthleteSport.setOnClickListener(View.OnClickListener {
            it.requestFocus()
            val calendar = Calendar.getInstance()
            val year = calendar.get(Calendar.YEAR)
            val month = calendar.get(Calendar.MONTH)
            val dayOfMonth = calendar.get(Calendar.DAY_OF_MONTH)

            // Create DatePickerDialog and show it
            val datePickerDialog = context?.let { it1 ->

                DatePickerDialog(
                    it1,
                    dateSetListener,
                    year,
                    month,
                    dayOfMonth
                )
            }
            datePickerDialog?.show()
        })


        // Set click listener for cancel button
        btnCancelAthlete.setOnClickListener {
            dismiss()
        }

        // Set click listener for add button
        btnAddAthlete.setOnClickListener {
            val athleteName = editTextAthleteName.text.toString()
            val athleteSport = editTextAthleteSport.text.toString()
            val athleteCountry = editTextAthleteCountry.text.toString()
            HistoricalArchiveList.historicalAdapterList.add(HistoricalArchiveModel(athleteName, athleteSport, athleteCountry))
            adapter.notifyDataSetChanged()
            dismiss()
        }

        val builder = AlertDialog.Builder(requireContext())
        builder.setView(view)
        return builder.create()
    }

}