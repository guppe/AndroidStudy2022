package com.websarva.wings.android.navigationbasic

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class AfterFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val v = inflater.inflate(R.layout.fragment_after, container, false)
        v.findViewById<TextView>(R.id.txValue)?.apply {
            text = "乱数:${arguments?.getInt("num")}"
        }
        return v
    }
}