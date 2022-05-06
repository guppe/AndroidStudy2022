package com.websarva.wings.android.lifecyclesample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("app","Sub onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)
    }

    override fun onStart() {
        Log.i("app","Sub onStart() called.")
        super.onStart()
    }

    override fun onRestart() {
        Log.i("app","Sub onRestart() called.")
        super.onRestart()
    }

    override fun onResume() {
        Log.i("app","Sub onResume() called.")
        super.onResume()
    }

    override fun onPause() {
        Log.i("app","Sub onPause() called.")
        super.onPause()
    }

    override fun onStop() {
        Log.i("app","Sub onStop() called.")
        super.onStop()
    }

    override fun onDestroy() {
        Log.i("app","Sub onDestroy() called.")
        super.onDestroy()
    }

    fun onButtonClick(view: View){
        finish()
    }
}