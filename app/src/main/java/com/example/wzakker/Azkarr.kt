package com.example.wzakker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.wzakker.Model.Model
import kotlinx.android.synthetic.main.activity_azkarr.*
import kotlinx.android.synthetic.main.activity_main.*

class Azkarr : AppCompatActivity(),OnItemClickListener {

    var azkar = ArrayList<Model>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_azkarr)
        creatAzkarList()
        var adp = RecyclerViewAdapter(azkar,this)
        rv.layoutManager=LinearLayoutManager(this)
        rv.adapter =adp
        adp.notifyDataSetChanged()
    }
    override fun onItemClick(position: Int) {
        val intent =Intent(this,LastActivity::class.java)
        intent.putExtra("name","اللهم بك أصبحنا وبك أمسينا وبك نحيى وبك نموت وإليك النشور")
        startActivity(intent)
    }
    fun creatAzkarList(){

        azkar.add(Model(R.drawable.azkarElsabah))
            azkar.add(Model(R.drawable.azkarElmasaa))
            azkar.add(Model(R.drawable.elesteqaz))
            azkar.add(Model(R.drawable.elnoom))

    }
    }