package com.example.lesson8task4kotlin

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter (fm: FragmentManager) : FragmentPagerAdapter(fm) {
    private  var list = ArrayList<Fragment>()
    private var title = ArrayList<String>()

    fun addLists(f: Fragment, s: String) {
        list.add(f)
        title.add(s)
    }

    override fun getItem(position: Int): Fragment {
        return list[position]
    }

    override fun getCount(): Int {
        return list.size
    }

    override fun getPageTitle(position: Int): CharSequence {
        return title[position]
    }
}