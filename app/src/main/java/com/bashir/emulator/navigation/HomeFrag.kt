package com.bashir.emulator.navigation

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.bashir.emulator.R
import com.bashir.emulator.databinding.ActivityExamBinding.inflate
import com.bashir.emulator.databinding.ActivityTask4Binding.inflate
import com.bashir.emulator.databinding.FragmentHomeBinding

class HomeFrag : Fragment() {

    private lateinit var binding: FragmentHomeBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.airforce.setOnClickListener {
            val action = HomeFragDirections.actionHomeFragToProductFrag()
            findNavController().navigate(action)
        }
    }
}