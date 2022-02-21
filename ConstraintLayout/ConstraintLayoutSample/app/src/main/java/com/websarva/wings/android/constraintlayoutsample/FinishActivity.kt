package com.websarva.wings.android.constraintlayoutsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val thankText: TextView = findViewById(R.id.thanksText)

        thankText.text = "Thank you!!"
    }
}