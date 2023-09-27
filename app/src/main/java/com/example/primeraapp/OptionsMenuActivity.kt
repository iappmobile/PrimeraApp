package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast

class OptionsMenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_options_menu)

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.bottom_nav, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
            when(item.itemId){
                R.id.menu_home -> Toast.makeText(this,"He pulsado Home", Toast.LENGTH_LONG).show()
                R.id.menu_map -> Toast.makeText(this,"He pulsado MAPA", Toast.LENGTH_LONG).show()
                R.id.menu_settings -> Toast.makeText(this,"He pulsado SETTINGS", Toast.LENGTH_LONG).show()
            }
        return super.onOptionsItemSelected(item)
    }





}