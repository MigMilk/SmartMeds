package com.example.aplicacaopee

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.EditText
import android.widget.Toast
import java.io.*

class calendary : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calendary)

        val editdata = findViewById<EditText>(R.id.textfromfile)         // TextFile Data
        val calendar = findViewById<CalendarView>(R.id.calendarView)
        var dia = 0;
        var mes = 0;
        var ano = 0;
        var string: String? = ""
        val stringBuilder = StringBuilder()
        val `is`: InputStream = this.resources.openRawResource(R.raw.sunday)
        val reader = BufferedReader(InputStreamReader(`is`))

        calendar.setOnDateChangeListener { calendar, i1, i2, i3 ->
            dia = i3;
            mes = i2+1;
            ano = i1;

            //Toast.makeText(this@calendary, "Selected Date: $dia/$mes/$ano", Toast.LENGTH_LONG).show()

            if(dia == 29){
                while (true) {
                    try {
                        if (reader.readLine().also { string = it } == null) break
                    } catch (e: IOException) {
                        e.printStackTrace()
                    }
                    stringBuilder.append(string).append("\n")
                }
                `is`.close()
                Toast.makeText(baseContext, stringBuilder.toString(),
                    Toast.LENGTH_LONG).show()
            }
        }
    }
}
