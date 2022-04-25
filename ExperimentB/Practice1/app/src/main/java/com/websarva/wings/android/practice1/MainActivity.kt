package com.websarva.wings.android.practice1

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val fontSizeList: Spinner = findViewById(R.id.fontSizeList)
        var fontSize = mutableListOf("12sp", "20sp", "34sp")
        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_spinner_item, fontSize)
        fontSizeList.adapter = adapter

        val textView: TextView = findViewById(R.id.textView)
        val inputText: EditText = findViewById(R.id.inputText)
        val helloButton: Button = findViewById(R.id.helloButton)
        val outputButton: Button = findViewById(R.id.outputButton)
        val redButton: Button = findViewById(R.id.redButton)
        val greenButton: Button = findViewById(R.id.greenButton)
        val blueButton: Button = findViewById(R.id.blueButton)

        helloButton.setOnClickListener{
            textView.text = "こんにちは"
        }

        outputButton.setOnClickListener{
            var output = inputText.text.toString()
            textView.text = output
        }

        redButton.setOnClickListener{
            textView.setTextColor(Color.parseColor("#ff0000"))
        }

        greenButton.setOnClickListener{
            textView.setTextColor(Color.parseColor("#00ff00"))
        }

        blueButton.setOnClickListener{
            textView.setTextColor(Color.parseColor("#0000ff"))
        }

        fontSizeList.onItemSelectedListener = ListItemSelectedListener()
    }

    private inner class ListItemSelectedListener : AdapterView.OnItemSelectedListener{
        override fun onItemSelected(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val textView: TextView = findViewById(R.id.textView)
            val item = parent.getItemAtPosition(position) as String
            when(item){
                "12sp" -> textView.setTextSize(12.0f)
                "20sp" -> textView.setTextSize(20.0f)
                "34sp" -> textView.setTextSize(34.0f)
            }
        }

        override fun onNothingSelected(p0: AdapterView<*>?) {

        }
    }
}