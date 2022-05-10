package com.example.lesson8task4kotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainBtnID: Button = findViewById(R.id.mainBtnID)
        mainBtnID.setOnClickListener( View.OnClickListener { open() })

    }

    private fun open(){
        val intent = Intent(this, ViewPagerActivity::class.java)
        startActivity(intent)
    }
}