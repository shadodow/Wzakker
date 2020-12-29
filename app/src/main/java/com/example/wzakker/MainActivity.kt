package com.example.wzakker


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var tex :TextView ?= null
    var azkar : Button ?= null
    var ad3ya : Button ?= null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tex = findViewById(R.id.tex)
        azkar = findViewById(R.id.azkar)
        ad3ya = findViewById(R.id.ad3ya)
        azkar?.setOnClickListener {
            startActivity(Intent(this,Azkarr ::class.java))
        }
    }
}
