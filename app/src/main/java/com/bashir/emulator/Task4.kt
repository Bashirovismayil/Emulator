package com.bashir.emulator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem

class Task4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task4)

        Log.d("MyLog", "OnCreate")

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.app_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.helpScreen -> {
                val intent = Intent(this, Task4_2::class.java)
                startActivity(intent)
                true
            }
            else -> false
        }
    }


    override fun onStart() {
        super.onStart()
        Log.d("MyLog", "OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("MyLog", "OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("MyLog", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("MyLog", "OnStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("MyLog", "OnDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("MyLog", "OnRestart")
    }


}