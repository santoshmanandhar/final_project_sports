package com.example.myapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.SportsList.Companion.sportsList
import com.example.myapplication.databinding.FragmentSportsBinding
import com.example.myapplication.dialog.AddSportDialogFragment
import com.example.myapplication.recyclerview.viewholder.adapter.SportsAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class SportsFragment : Fragment() {

    private var _binding: FragmentSportsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: SportsAdapter
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentSportsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val floatingActionButton: FloatingActionButton = binding.fab

        floatingActionButton.setOnClickListener(View.OnClickListener {
            val addSportDialog = AddSportDialogFragment()
            addSportDialog.show(requireActivity().supportFragmentManager, "AddSportDialog")
        })

        recyclerView = binding.recyclerView
        adapter = SportsAdapter(sportsList)
        recyclerView.adapter = adapter
        recyclerView.layoutManager = GridLayoutManager(context, 2, GridLayoutManager.VERTICAL, false)


        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}