package com.websarva.wings.android.navigationapp2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toolbar
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration



class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navController = (supportFragmentManager.
                findFragmentById(R.id.fragment) as NavHostFragment).navController
        findViewById<Toolbar>(R.id.toolbar).setupWithNavController(
            navController,
            AppBarConfiguration(navController.graph)
        )
    }
}