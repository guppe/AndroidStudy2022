package com.websarva.wings.android.hellosample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickButton: Button = findViewById(R.id.clickButton)
        clickButton.setOnClickListener(HelloListener())
    }

    private inner class HelloListener : View.OnClickListener{
        override fun onClick(p0: View?) {
            val inputName: TextView = findViewById(R.id.nameEdit)
            val outputName: TextView = findViewById(R.id.nameView)

            val inputStr = inputName.text.toString()
            outputName.text = inputStr + "さん、こんにちは！"
        }
    }
}