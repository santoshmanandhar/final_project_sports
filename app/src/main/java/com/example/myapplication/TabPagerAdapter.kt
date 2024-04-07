package com.example.myapplication

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.myapplication.ui.AboutmeFragment
import com.example.myapplication.ui.AthletesFragment
import com.example.myapplication.ui.EventsFragment
import com.example.myapplication.ui.HistoricalArchivesFragment
import com.example.myapplication.ui.NewsFragment
import com.example.myapplication.ui.SportsFragment
import com.example.myapplication.ui.dashboard.DashboardFragment
import com.example.myapplication.ui.home.HomeFragment
import com.example.myapplication.ui.notifications.NotificationsFragment

class TabPagerAdapter(fragmentManager: FragmentManager, lifecycle: Lifecycle, private val numTabs: Int) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return numTabs
    }

    override fun createFragment(position: Int): Fragment {
        // Return a dummy fragment based on the tab position
        return when (position) {
            0 -> SportsFragment()
            1 -> NewsFragment()
            2 -> AthletesFragment()
            3 -> EventsFragment()
            4 -> HistoricalArchivesFragment()
            5 -> AboutmeFragment()
            else -> throw IllegalArgumentException("Invalid tab position")
        }
    }
}
