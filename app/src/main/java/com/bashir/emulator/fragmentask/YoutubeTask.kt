package com.bashir.emulator.fragmentask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.bashir.emulator.R
import com.bashir.emulator.databinding.ActivityYoutubeTaskBinding

class YoutubeTask : AppCompatActivity() {

    lateinit var binding: ActivityYoutubeTaskBinding

    lateinit var shortsFragment: MyShorts
    lateinit var subscriptionsFragment: MySubs

    lateinit var fragmentManager: FragmentManager
    lateinit var fragmentTransaction: FragmentTransaction

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityYoutubeTaskBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun transition(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentContainerView, fragment)
            commit()
        }
    }

}