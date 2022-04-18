package com.websarva.wings.android.constraintlayoutsample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class startActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
    }

    fun onCreateButton(view: View) {
        val intent = Intent(this@startActivity, MainActivity::class.java)
        startActivity(intent)
    }
}