package com.example.aplicacaopee

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import java.io.*
import java.lang.Exception

class friday : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_friday)

        val btnsave     = findViewById<Button>(R.id.savebtn)        // Button
        val btnview     = findViewById<Button>(R.id.displaybtn)     // Button
        val editfile    = findViewById<EditText>(R.id.name)         // TextFile Name
        val editdata    = findViewById<EditText>(R.id.data)         // TextFile Data

        btnsave.setOnClickListener {
            val file = editfile.text.toString()                     // TextFile Content File Name
            val data = editdata.text.toString()                     // TextFile Content File Data

            val fileOutputStream: FileOutputStream

            try {
                fileOutputStream = openFileOutput(file, Context.MODE_PRIVATE)   // create file
                fileOutputStream.write(data.toByteArray())                      // write on file
            }

            catch (e: FileNotFoundException){
                e.printStackTrace()
            }

            catch (e: Exception) {
                e.printStackTrace()
            }

            showToast("Saved to file ")
        }

        btnview.setOnClickListener {
            val filename = editfile.text.toString()                 // TextFile Content File Name

            if(filename.toString()!=null && filename.trim()!=""){
                var fileInputStream: FileInputStream? = null
                fileInputStream = openFileInput(filename)
                var inputStreamReader: InputStreamReader = InputStreamReader(fileInputStream)
                val bufferedReader: BufferedReader = BufferedReader(inputStreamReader)

                val stringBuilder: StringBuilder = StringBuilder()
                var text: String? = null

                while ({ text = bufferedReader.readLine(); text}() != null) {
                    stringBuilder.append(text)
                }

                editdata.setText(stringBuilder.toString()).toString()
            }
            else
                showToast("name of the file cant be blank")
        }
    }

    fun Context.showToast(text: CharSequence, duration: Int = Toast.LENGTH_SHORT) {     // Function send notification in APP
        Toast.makeText(this,text,duration).show()
    }
}
