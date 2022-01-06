package com.example.aplicacaopee

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class newcalendario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.calendario)

        val bsunday     = findViewById<Button>(R.id.sunday)
        val bmonday     = findViewById<Button>(R.id.monday)
        val btuesday    = findViewById<Button>(R.id.tuesday)
        val bwednesday  = findViewById<Button>(R.id.wednesday)
        val bthursday   = findViewById<Button>(R.id.thursday)
        val bfriday     = findViewById<Button>(R.id.friday)
        val bsaturday   = findViewById<Button>(R.id.saturday)

        bsunday.setOnClickListener {
            startActivity(Intent(this@newcalendario, sunday::class.java))
        }
        bmonday.setOnClickListener {
            startActivity(Intent(this@newcalendario, monday::class.java))
        }
        btuesday.setOnClickListener {
            startActivity(Intent(this@newcalendario, tuesday::class.java))
        }
        bwednesday.setOnClickListener {
            startActivity(Intent(this@newcalendario, wednesday::class.java))
        }
        bthursday.setOnClickListener {
            startActivity(Intent(this@newcalendario, thursday::class.java))
        }
        bfriday.setOnClickListener {
            startActivity(Intent(this@newcalendario, friday::class.java))
        }
        bsaturday.setOnClickListener {
            startActivity(Intent(this@newcalendario, Saturday::class.java))
        }
    }
}