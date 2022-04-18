package com.websarva.wings.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.clickButton)
        val listener = HelloListener()
        clickButton.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener{
        override fun onClick(v: View?) {
            val inputName: EditText = findViewById(R.id.nameEdite)
            val outputText: TextView = findViewById(R.id.outputText)
            val inputStr = inputName.text.toString()

            outputText.text = inputStr + "さん、こんにちは"
        }
    }
}