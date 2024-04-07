package com.example.myapplication.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.data.NewsList.Companion.newsList
import com.example.myapplication.databinding.FragmentNewsBinding
import com.example.myapplication.dialog.AddNewsDialogFragment
import com.example.myapplication.dialog.AddSportDialogFragment
import com.example.myapplication.recyclerview.viewholder.adapter.NewsAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class NewsFragment : Fragment() {

    private var _binding: FragmentNewsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {


        _binding = FragmentNewsBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val recyclerView: RecyclerView = binding.recyclerViewNews
        val adapter = NewsAdapter(newsList)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = adapter

        val floatingActionButton: FloatingActionButton = binding.fabNewNews

        floatingActionButton.setOnClickListener(View.OnClickListener {
            val addSportDialog = AddNewsDialogFragment()
            addSportDialog.show(requireActivity().supportFragmentManager, "AddSportDialog")
        })

        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}