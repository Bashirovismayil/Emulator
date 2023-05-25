package com.bashir.emulator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.TextView

class ThirdEmulator : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third_emulator)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN


        val editTextNum = findViewById<EditText>(R.id.enterPrice)
        val buttonPrice = findViewById<Button>(R.id.priceButton)
        val textViewResult = findViewById<TextView>(R.id.textViewResult)
        buttonPrice.setOnClickListener {
            val number = editTextNum.text.toString().toInt()
            val result = number * 1.7
            textViewResult.text = result.toString()

        }

        val imageButton = findViewById<Button>(R.id.changeImage)
        val imageView = findViewById<ImageView>(R.id.imageView)

        var counter = 0
        imageButton.setOnClickListener {
            if (counter % 2 == 0) {

                imageView.setImageResource(R.drawable.s23)
            } else {
                imageView.setImageResource(R.drawable.iphone14pro)

            }
            counter++
        }
    }
}