package com.example.playlistmaker

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val buttonSearch = findViewById<Button>(R.id.button_search)
        val buttonMedia = findViewById<Button>(R.id.button_media)
        val buttonSettings = findViewById<Button>(R.id.button_settings)

        buttonSearch.setOnClickListener {
            val displayIntent = Intent(this, SearchActivity::class.java)
            startActivity(displayIntent)
        }

        buttonMedia.setOnClickListener {
          val displayIntent = Intent(this, MediaActivity::class.java)
        startActivity(displayIntent)
        }

        buttonSettings.setOnClickListener {
            val displayIntent = Intent(this, SettingsActivity::class.java)
            startActivity(displayIntent)
        }


    }
}