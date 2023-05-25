package com.bashir.emulator

import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.util.Log
import android.widget.ImageButton
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class Task6 : AppCompatActivity() {

    private lateinit var permissionLauncher: ActivityResultLauncher<String>
    private lateinit var actionResultLauncher: ActivityResultLauncher<Intent>
    private var image: Uri? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task6)
        val imageButton = findViewById<ImageButton>(R.id.worldButton)
        register()
println()
        imageButton.setOnClickListener {
            checkPermission()

        }

    }

    fun register() {
        permissionLauncher =
            registerForActivityResult(ActivityResultContracts.RequestPermission()) { result ->
                if (result) {
                    // permission granted
                    val intent =
                        Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
                    actionResultLauncher.launch(intent)

                } else {
                    //permission denied
                }

            }
        actionResultLauncher =
            registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
                if (result.resultCode == RESULT_OK) {
                    // permission granted
                    val d = result.data
                    if (d != null) {
                        image = d.data
                        Log.d("MyImage Uri", "$image")
                    }
                } else {
                    //permission denied
                    Log.d("MyImage Uri", "$image")
                }
            }

    }

    fun checkPermission() {
        if (ContextCompat.checkSelfPermission(
                this,
                android.Manifest.permission.READ_EXTERNAL_STORAGE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(
                    this,
                    android.Manifest.permission.READ_EXTERNAL_STORAGE
                )
            ) {

            } else {
                permissionLauncher.launch(android.Manifest.permission.READ_EXTERNAL_STORAGE)
            }
        } else {
            val intent = Intent(Intent.ACTION_PICK, MediaStore.Images.Media.EXTERNAL_CONTENT_URI)
            actionResultLauncher.launch(intent)
        }
    }

}

  
