package com.bashir.emulator.fragmentask

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import com.bashir.emulator.R


class MySubs : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        return inflater.inflate(R.layout.fragment_subscriptions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val shortsbutton = requireActivity().findViewById<ImageView>(R.id.shortsbutton)

        shortsbutton.setOnClickListener {
            (activity as YoutubeTask).transition(MyShorts())
        }

    }


}