package com.websarva.wings.android.navigationapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import java.util.*

class BeforeFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_before, container, false)
        view.findViewById<Button>(R.id.btNext).setOnClickListener {
            Navigation.findNavController(it).navigate(
                BeforeFragmentDirections.actionBeforeFragmentToAfterFragment().apply {
                    num = Random().nextInt(100)
                }
            )
        }
        return view
    }
}