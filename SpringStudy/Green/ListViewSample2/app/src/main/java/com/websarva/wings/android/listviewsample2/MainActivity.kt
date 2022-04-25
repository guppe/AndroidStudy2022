package com.websarva.wings.android.listviewsample2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Adapter
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val menuListView: ListView = findViewById(R.id.menuListView)

        var menuList = mutableListOf("から揚げ定食" , "ハンバーグ定食", "生姜焼き定食", "ステーキ定食",
        "野菜炒め定食", "トンカツ定食", "ミンチカツ定食", "チキンカツ定食", "コロッケ定食", "回鍋肉定食",
        "麻婆豆腐定食", "青椒肉絲定食", "焼き魚定食", "焼肉定食")

        val adapter = ArrayAdapter(this@MainActivity, android.R.layout.simple_list_item_1, menuList)
        menuListView.adapter = adapter

        menuListView.onItemClickListener = ListItemClickListener()
    }
    private inner class ListItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            val dialogFragment = OrderConfirmDialogFragment()
            dialogFragment.show(supportFragmentManager, "OrderConfirmDialogFragment")
        }
    }
}