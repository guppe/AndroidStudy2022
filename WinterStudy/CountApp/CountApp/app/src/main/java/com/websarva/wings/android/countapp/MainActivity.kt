package com.websarva.wings.android.countapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val numberText: TextView = findViewById(R.id.numberText)
        val plusButton: Button = findViewById(R.id.plusButton)
        val minusButton: Button = findViewById(R.id.minusButton)
        val clearButton: Button = findViewById(R.id.clearButton)

        var num: Int = 0

        plusButton.setOnClickListener {
            num += 1
            /*if (num % 3 == 0 && num != 0){
                numberText.setTextColor(Color.parseColor("#96ffc1"))
            }*/
            color(num)
            numberText.text = num.toString()
        }

        minusButton.setOnClickListener {
            num -= 1
            /*if (num % 3 == 0 && num != 0){
                numberText.setTextColor(Color.parseColor("#96ffc1"))
            }*/
            color(num)
            numberText.text = num.toString()
        }

        clearButton.setOnClickListener {
            num = 0
            numberText.text = num.toString()
        }
    }

    fun color(num : Int) {
        val numberText: TextView = findViewById(R.id.numberText)
        if (num % 3 == 0 && num != 0) {
            numberText.setTextColor(Color.parseColor("#96ffc1"))
        } else {
            numberText.setTextColor(Color.parseColor("#000000"))
        }
    }
}