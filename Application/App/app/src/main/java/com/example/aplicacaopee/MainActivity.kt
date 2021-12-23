package com.example.aplicacaopee

import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Window
import android.widget.Button
import android.widget.EditText
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat


class MainActivity : AppCompatActivity() {

    private val CHANNEL_ID = "channel_id_example_01"                 // notification ID
    private val notificationId = 101                                 // notification ID

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)                               //add login.xml

        val Password = findViewById<EditText>(R.id.password)         // TextFile Password
        val Username = findViewById<EditText>(R.id.username)         // TextFile Username
        val ConteudoPassword = Password.text.toString()              // TextFile Content Password
        val ConteudoUsername = Username.text.toString()              // TextFile Content Username

        createNotificationChannel()

        val blogin = findViewById<Button>(R.id.loginbtn)             //login button
        // nome da variavel = """""(R.id.nomedobutao)

        blogin.setOnClickListener {                                  //handle button click
                                                                     //start activity intent
            startActivity(Intent(this@MainActivity, newcalendario::class.java))
            sendNotification()                                       //send Notification
        }
    }

    private fun createNotificationChannel() {                                       // Function CREATE notification
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Notification Title"                                 // Title variable
            val descriptionText = "Notification Description"                // Description variable
            val importance = NotificationManager.IMPORTANCE_DEFAULT
            val channel = NotificationChannel(CHANNEL_ID, name, importance).apply {
                description = descriptionText
            }

            val notificationManager: NotificationManager = getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    private fun sendNotification() {                                                // Function SEND notification
        val builder = NotificationCompat.Builder(this, CHANNEL_ID)
            .setSmallIcon(R.drawable.ic_launcher_foreground)
            .setContentTitle("ATENÇÃO")                                     // Notification Title
            .setContentText("Login efetuado")                               // Notification Description
            .setPriority(NotificationCompat.PRIORITY_DEFAULT)               // Notification Priority
        with(NotificationManagerCompat.from(this)) {
            notify(notificationId, builder.build())
        }
    }
}