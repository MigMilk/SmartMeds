package com.example.aplicacaopee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button


class newmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val bsearch = findViewById<Button>(R.id.searchutente)         //search button

        bsearch.setOnClickListener {                                   //handle button click
            startActivity(Intent(this@newmenu, calendary::class.java))
        }
    }
}
