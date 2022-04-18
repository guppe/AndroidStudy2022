package com.websarva.wings.android.intentsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.SimpleAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuListView: ListView = findViewById(R.id.menuListView)
        //SimpleAdapterで使用するMutableListオブジェクトを用意
        val menuList: MutableList<MutableMap<String, String>> = mutableListOf()

        var menu = mutableMapOf("name" to "トマト", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "きゅうり", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "なす", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "たまねぎ", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "オクラ", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "さつまいも", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "じゃがいも", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "はくさい", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "大根", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "にんじん", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "とうもろこし", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "ピーマン", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "ねぎ", "price" to "120円")
        menuList.add(menu)

        menu = mutableMapOf("name" to "にら", "price" to "120円")
        menuList.add(menu)

        //SimpleAdapterの第4引数from用データの用意
        val from = arrayOf("name", "price")
        //SimpleAdapter第5引数to用データの用意
        val to = intArrayOf(android.R.id.text1, android.R.id.text2)

        val adapter = SimpleAdapter(this@MainActivity, menuList, android.R.layout.simple_list_item_2,
        from, to)

        menuListView.adapter = adapter

        menuListView.onItemClickListener = ListItemClickListener()
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener {
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val item = parent.getItemAtPosition(position) as MutableMap<String, String>
            val menuName = item["name"]
            val menuPrice = item["price"]
            val intent = Intent(this@MainActivity, MenuThanksActivity::class.java)
            intent.putExtra("menuName", menuName)
            intent.putExtra("menuPrice", menuPrice)
            startActivity(intent)
        }
    }
}