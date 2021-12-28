package com.example.aplicacaopee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast

class calendary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendary)

        val calendar = findViewById<CalendarView>(R.id.calendarView)
        var dia = 0;
        var mes = 0;
        var ano = 0;

        calendar.setOnDateChangeListener { calendar, i1, i2, i3 ->
            dia = i3;
            mes = i2+1;
            ano = i1;

            Toast.makeText(this@calendary, "Selected Date: $dia/$mes/$ano", Toast.LENGTH_LONG).show()
        }
    }
}
