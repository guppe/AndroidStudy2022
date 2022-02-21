package com.websarva.wings.android.hellosample2

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

        val clearButton: Button = findViewById(R.id.clearButton)
        clearButton.setOnClickListener(listener)
    }

    private inner class HelloListener : View.OnClickListener{
        override fun onClick(v : View?) {
            val inputName: EditText = findViewById(R.id.nameEdit)
            val outputText: TextView = findViewById(R.id.outputText)

            when(v?.id) {
                R.id.clickButton -> {
                    val inputStr = inputName.text.toString()

                    outputText.text = inputStr + "さん、こんにちは！"
                }

                R.id.clearButton -> {
                    inputName.setText("")
                    outputText.text = ""
                }
            }
        }
    }
}