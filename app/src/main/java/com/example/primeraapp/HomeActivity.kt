package com.example.primeraapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class HomeActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var tvEmail:TextView = findViewById(R.id.tv_email)

        val intent = getIntent().extras
        tvEmail.text =  intent?.getString("email", "No tiene valor")

        



    }
}