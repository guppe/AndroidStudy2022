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
        clickButton.setOnClickListener(Listener())

        val clearButton: Button = findViewById(R.id.clearButton)
        clearButton.setOnClickListener(Listener())
    }

    private inner class Listener : View.OnClickListener{
        override fun onClick(view: View) {
            val inputName: TextView = findViewById(R.id.nameEdit)
            val outputName: TextView = findViewById(R.id.nameView)

            when(view.id){
                R.id.clickButton -> {
                    val inputStr = inputName.text.toString()
                    outputName.text = inputStr + "さん、こんにちは！"
                }
                R.id.clearButton -> {
                    inputName.setText("")
                    outputName.text = ""
                }
            }
        }
    }
}