package com.websarva.wings.android.intentsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import org.w3c.dom.Text

class MenuThanksActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_thanks)

        val menuName = intent.getStringExtra("menuName")
        val menuPrice = intent.getStringExtra("menuPrice")

        val menuNameText: TextView = findViewById(R.id.menuNameText)
        val menuPriceText: TextView = findViewById(R.id.menuPriceText)

        menuNameText.text = menuName
        menuPriceText.text = menuPrice
    }

    fun onBackButtonClick(view: View){
        finish()
    }
}