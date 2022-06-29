package com.websarva.wings.android.databasesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var _cocktailId = -1
    private var _cocktailName = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val cocktailListView: ListView = findViewById(R.id.cocktailListView)
        cocktailListView.onItemClickListener = ListItemClickListener()
    }

    fun onSaveButtonClick(view: View){
        val noteEdit: EditText = findViewById(R.id.noteEdit)
        noteEdit.setText("")
        val name: TextView = findViewById(R.id.nameTextView)
        name.text = getString(R.string.tv_name)
        val saveButton: Button = findViewById(R.id.saveButton)
        saveButton.isEnabled = false
    }

    private inner
}