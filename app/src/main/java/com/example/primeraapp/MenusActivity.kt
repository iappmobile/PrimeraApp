package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MenusActivity : AppCompatActivity() {

    lateinit var bottom_menu:BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menus)

        replacefragment(HomeFragment())

        bottom_menu = findViewById(R.id.bottomNavigationView)

        bottom_menu.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> replacefragment(HomeFragment())
                R.id.menu_map -> replacefragment(MapFragment())
                R.id.menu_settings -> replacefragment(SettingsFragment())

                else ->{
                }
            }
            true
        }
    }
    fun replacefragment(fragment: Fragment) {
        val fragmentManager = supportFragmentManager
        val fragmentTransaction = fragmentManager.beginTransaction()
        fragmentTransaction.replace(R.id.frame_layout, fragment)
        fragmentTransaction.commit()
    }




}