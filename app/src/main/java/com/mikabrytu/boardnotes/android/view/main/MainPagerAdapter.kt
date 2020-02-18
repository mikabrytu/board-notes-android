package com.mikabrytu.boardnotes.android.view.main

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.mikabrytu.boardnotes.android.view.events.EventsFragment
import com.mikabrytu.boardnotes.android.view.sessions.SessionsFragment

class MainPagerAdapter(ctx: Context, fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private val context = ctx
    private val titleEvents = "Events"
    private val titleSessions = "Sessions"
    private val pageCount = 2

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> titleEvents
            1 -> titleSessions
            else -> ""
        }
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> EventsFragment()
            1 -> SessionsFragment()
            else -> Fragment()
        }
    }

    override fun getCount(): Int = pageCount

}