package com.example.finaltask.adapters

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.example.finaltask.tabs.TabOne
import com.example.finaltask.tabs.TabThree
import com.example.finaltask.tabs.TabTwo

@Suppress("DEPRECATION")

internal class TabAdapter (
    var context: Context,
    fm: FragmentManager,
    var totalTabs: Int ): FragmentPagerAdapter(fm) {
    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> {
                TabOne()
            }
            1 -> {
                TabTwo()
            }
            2 -> {
                TabThree()
            }
            else -> getItem(position)
        }
    }
    override fun getCount(): Int {
        return totalTabs
    }
}
