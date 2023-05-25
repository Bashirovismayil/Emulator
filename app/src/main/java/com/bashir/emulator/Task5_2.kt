package com.bashir.emulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.net.toUri

class Task5_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task52)


        val linkbutton = findViewById<ImageButton>(R.id.linkbutton)
        val mylink = "https://developer.android.com/distribute".toUri()
        val data = intent.getStringExtra("data")
        val usernameDefault = findViewById<TextView>(R.id.usernameDefault)
        usernameDefault.text = data
        Log.d("myAppData", "$data")






        linkbutton.setOnClickListener {
            val intent = Intent(Intent.ACTION_VIEW, mylink)
            startActivity(intent)

        }

    }
}