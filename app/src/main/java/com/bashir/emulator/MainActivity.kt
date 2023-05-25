package com.bashir.emulator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)
        val username = findViewById<EditText>(R.id.editTextTextPersonName)
        val email = findViewById<EditText>(R.id.editTextEmail)
        val password = findViewById<EditText>(R.id.editTextTextPersonName4)

        button.setOnClickListener {
            Log.d("Mylog", "${username.text},${email.text}, ${password.text}")

        }
    }
}

