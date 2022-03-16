package com.example.aplicacaopee

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class TestarDATABASE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)

        val btninsert = findViewById<Button>(R.id.btninsert)
        val etvName = findViewById<EditText>(R.id.etvName)         // TextFile Password
        val etvAge = findViewById<EditText>(R.id.etvAge)
        val context = this

        btninsert.setOnClickListener {
            if (etvName.text.toString().isNotEmpty() &&
                etvAge.text.toString().isNotEmpty()) {
                var user = User(etvName.text.toString(), etvAge.text.toString().toInt())
                var db = DataBaseHandler(context)
                db.insertData(user)
            }else{
                Toast.makeText(context,"Please Fill All Data's", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
