package com.example.myapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.data.AboutData
import com.example.myapplication.databinding.FragmentAboutMeBinding
import com.example.myapplication.databinding.FragmentDashboardBinding
import com.example.myapplication.dialog.AddAthleteDialogFragment
import com.example.myapplication.dialog.EditProfile
import com.google.android.material.floatingactionbutton.FloatingActionButton

class AboutmeFragment : Fragment() {

    private var _binding: FragmentAboutMeBinding? = null

    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAboutMeBinding.inflate(inflater, container, false)
        val root: View = binding.root
        val name: TextView = binding.textViewName
        val desc: TextView = binding.textViewAboutMe

        name.text = AboutData.aboutData.name
        desc.text = AboutData.aboutData.desc
        val floatingActionButton: FloatingActionButton = binding.fabAboutUs
        floatingActionButton.setOnClickListener(View.OnClickListener {
            val addSportDialog = EditProfile()
            addSportDialog.show(requireActivity().supportFragmentManager, "AddSportDialog")
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}