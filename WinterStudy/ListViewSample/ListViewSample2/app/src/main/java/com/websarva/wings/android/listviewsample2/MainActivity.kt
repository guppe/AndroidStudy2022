package com.websarva.wings.android.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val lvMenu: ListView = findViewById(R.id.lvMenu)

        var menuList = mutableListOf("トマト", "きゅうり", "なす", "たまねぎ", "オクラ", "さつまいも",
        "じゃがいも", "はくさい", "大根", "にんじん", "とうもろこし", "ピーマン", "ねぎ", "にら")

        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1,
        menuList)

        lvMenu.adapter = adapter

        lvMenu.onItemClickListener = ListItemClickListener()
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
            val dialogFragment = OrderConfirmDialogFragment()
            dialogFragment.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }
}