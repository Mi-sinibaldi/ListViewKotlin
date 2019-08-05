package com.example.listviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    lateinit var  listView: ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        listView = findViewById(R.id.listView)

        val heroes = arrayOf("Ironman", "Thor", "Spiderman", "Batman")

        listView.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, heroes)

        listView.setOnItemClickListener { adpterView, view, i, l ->

            Toast.makeText(applicationContext, "You clicked" + heroes[i], Toast.LENGTH_SHORT)
        }

    }
}
