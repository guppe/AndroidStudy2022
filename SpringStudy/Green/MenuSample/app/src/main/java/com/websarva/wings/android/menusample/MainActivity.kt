package com.websarva.wings.android.menusample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private var _menuList: MutableList<MutableMap<String, Any>> = mutableListOf()
    private val _from = arrayOf("name", "price")
    private val _to = intArrayOf(R.id.menuNameRowText, R.id.menuPriceRowText)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        _menuList = createTeishokuList()
        val menuListView: ListView = findViewById(R.id.menuListView)
        val adapter = SimpleAdapter(this@MainActivity, _menuList, R.layout.row, _from, _to)
        menuListView.adapter = adapter
        menuListView.onItemClickListener = ListItemClickListener()

        registerForContextMenu(menuListView)
    }

    private fun createTeishokuList(): MutableList<MutableMap<String, Any>>{
        val menuList: MutableList<MutableMap<String, Any>> = mutableListOf()

        var menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "から揚げ定食", "price" to "800",
            "desc" to "サラダ・ご飯・味噌汁が付いています")
        menuList.add(menu)

        return menuList
    }

    private inner class ListItemClickListener : AdapterView.OnItemClickListener{
        override fun onItemClick(parent: AdapterView<*>, view: View, position: Int, id: Long) {
            //Log.i("Main", "push Item:")
            val item = parent.getItemAtPosition(position) as MutableMap<String, Any>
            order(item)

            /*
            val menuName = item["name"] as String
            //元々Intだから型の指定を再度すると怒られる
            val menuPrice = item["price"]

            val intentMenuThanks = Intent(this@MainActivity, MenuThanksActivity::class.java)
            intentMenuThanks.putExtra("menuName", menuName)
            intentMenuThanks.putExtra("menuPrice", "${menuPrice}円")
            startActivity(intentMenuThanks)
             */
        }
    }

    private fun order(menu: MutableMap<String, Any>){
        val menuName = menu["name"] as String
        val menuPrice = menu["price"]

        val intentMenuThanks = Intent(this@MainActivity, MenuThanksActivity::class.java)
        intentMenuThanks.putExtra("menuName", menuName)
        intentMenuThanks.putExtra("menuPrice", "${menuPrice}円")
        startActivity(intentMenuThanks)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_options_menu_list, menu)
        return true
    }

    private fun createCurryList(): MutableList<MutableMap<String, Any>> {
        val menuList: MutableList<MutableMap<String, Any>> = mutableListOf()

        var menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        menu = mutableMapOf<String, Any>("name" to "ビーフカレー", "price" to "700",
            "desc" to "サラダとスープが付いています")
        menuList.add(menu)

        return menuList
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var returnVal = true

        when(item.itemId) {
            R.id.menuListOptionTeishoku ->
                _menuList = createTeishokuList()
            R.id.menuListOptionCurry ->
                _menuList = createCurryList()
            else ->
                returnVal = super.onOptionsItemSelected(item)
        }

        val menuListView:ListView = findViewById(R.id.menuListView)
        val adapter = SimpleAdapter(this@MainActivity, _menuList, R.layout.row, _from, _to)
        menuListView.adapter = adapter
        return returnVal
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        menuInflater.inflate(R.menu.menu_context_menu_list, menu)
        menu?.setHeaderTitle(R.string.menu_list_context_header)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var returnVal = true
        val info = item.menuInfo as AdapterView.AdapterContextMenuInfo
        val listPosition = info.position
        val menu = _menuList[listPosition]

        when(item.itemId){
            R.id.menuListContextDesc -> {
                val desc = menu["desc"] as String
                Toast.makeText(this@MainActivity, desc, Toast.LENGTH_LONG).show()
            }
            R.id.menuListContextOrder ->
                order(menu)
            else ->
                returnVal = super.onContextItemSelected(item)
        }
        return returnVal
    }
}