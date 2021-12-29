package com.example.aplicacaopee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.ArrayAdapter

class newmenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val bsearch = findViewById<Button>(R.id.searchutente)         //search button
        val autotextView = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView)
        val languages = resources.getStringArray(R.array.Nomes)

        val COUNTRIES = arrayOf(
            "João André", "António", "Vasco Ferreira", "Joana Almeida", "Gil", "Ana"
        )

        val adapter = ArrayAdapter(this,
            android.R.layout.simple_list_item_1, COUNTRIES)
        autotextView.setAdapter(adapter)

        bsearch.setOnClickListener {                                   //handle button click
            startActivity(Intent(this@newmenu, calendary::class.java))
        }
    }
}
