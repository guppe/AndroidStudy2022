package com.websarva.wings.android.lifecyclesample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.i("app","Main onCreate() called.")
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public override fun onStart() {
        Log.i("app","Main onStart() called.")
        super.onStart()
    }

    public override fun onRestart() {
        Log.i("app","Main onRestart() called.")
        super.onRestart()
    }

    public override fun onResume() {
        Log.i("app","Main onResume() called.")
        super.onResume()
    }

    public override fun onPause() {
        Log.i("app","Main onPause() called.")
        super.onPause()
    }

    public override fun onStop() {
        Log.i("app","Main onStop() called.")
        super.onStop()
    }

    public override fun onDestroy() {
        Log.i("app","Main onDestroy() called.")
        super.onDestroy()
    }

    fun onButtonClick(view: View) {
        val intent = Intent(this@MainActivity, SubActivity::class.java)
        startActivity(intent)
    }
}