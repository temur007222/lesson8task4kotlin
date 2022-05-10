package com.example.lesson8task4kotlin

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.example.lesson8task4kotlin.Fragments.FirstFrag
import com.example.lesson8task4kotlin.Fragments.SecondFrag
import com.google.android.material.tabs.TabLayout

class ViewPagerActivity: AppCompatActivity() {
    var viewPager: ViewPager? = null
    var viewPagerAdapter: ViewPagerAdapter? = null
    var tableLayout: TabLayout? = null
    private var TAG = ViewPagerActivity::class.java.toString()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pager)
        initView()

    }

    fun initView(){
        viewPager = findViewById(R.id.viewpagerID)
        viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPagerAdapter?.addLists(FirstFrag(), "Main news")
        viewPagerAdapter?.addLists(SecondFrag(), "News of the day")
        viewPager?.adapter = viewPagerAdapter
        tableLayout = findViewById(R.id.tableID)
        tableLayout?.setupWithViewPager(viewPager)


    }
}