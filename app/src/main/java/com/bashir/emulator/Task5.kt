package com.bashir.emulator

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class Task5 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task5)

        val loginButton = findViewById<Button>(R.id.loginbutton)
        val editText = findViewById<EditText>(R.id.enterusername)


        loginButton.setOnClickListener {
            val intent = Intent(this, Task5_2::class.java)
            val data = editText.text.toString()
            intent.putExtra("data", data)

            startActivity(intent)
            finish()
        }

    }
}