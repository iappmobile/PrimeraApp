package com.example.primeraapp

import android.R.attr.checked
import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.PorterDuff
import android.os.Bundle
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.isVisible


class SwitchActivity : AppCompatActivity() {

    var tieneHijos = false

    @SuppressLint("ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_switch)

        var switchText:Switch = findViewById(R.id.sw_texto)
        var tvSwitch:TextView = findViewById(R.id.tv_switchtext)

        tvSwitch.isVisible = false



        switchText.setOnCheckedChangeListener { buttonView, isChecked ->
            if (isChecked) {
               // tvSwitch.isVisible = true
                tieneHijos = true

            } else {
                //tvSwitch.isVisible = false
                tieneHijos = false

            }

            tvSwitch.isVisible = tieneHijos
        }

        /*
        if (switchText.isChecked) {
            tvSwitch.isVisible = true
        }
        */

    }
}