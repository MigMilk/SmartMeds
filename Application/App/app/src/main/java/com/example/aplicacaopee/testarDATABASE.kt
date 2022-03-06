package com.example.aplicacaopee

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class testarDATABASE : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.testing)

        val btn_insert = findViewById<Button>(R.id.btn_insert)
        val etvName = findViewById<EditText>(R.id.etvName)         // TextFile Password
        val etvAge = findViewById<EditText>(R.id.etvAge)
        val context = this

        btn_insert.setOnClickListener {
            if (etvName.text.toString().length > 0 &&
                etvAge.text.toString().length > 0) {
                var user = User(etvName.text.toString(), etvAge.text.toString().toInt())
                var db = DataBaseHandler(context)
                db.insertData(user)
            }else{
                Toast.makeText(context,"Please Fill All Data's", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
