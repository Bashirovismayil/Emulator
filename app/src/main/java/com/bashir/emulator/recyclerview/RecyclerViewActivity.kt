package com.bashir.emulator.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bashir.emulator.R

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)

        var appList = mutableListOf<RecyclerData>(
            RecyclerData("title_1", "image_1", "channel_name", "view_data"),
            RecyclerData("title_2", "image_2", "channel_name2", "view_data2"),
            RecyclerData("title_3", "image_3", "channel_name3", "view_data3"),
            RecyclerData("title_4", "image_4", "channel_name4", "view_data4"),
            RecyclerData("title_5", "image_5", "channel_name5", "view_data5"),
            RecyclerData("title_6", "image_6", "channel_name6", "view_data6"),
            RecyclerData("title_7", "image_7", "channel_name7", "view_data7")

        )

        val itemAdapter = ItemAdapter(this, appList)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        recyclerview.adapter = itemAdapter
        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false )

    }
}