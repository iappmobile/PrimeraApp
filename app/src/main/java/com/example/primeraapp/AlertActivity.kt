package com.example.primeraapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class AlertActivity : AppCompatActivity() {

    lateinit var alert:AlertDialog.Builder

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_alert)

        AlertCampos()

    }

    fun AlertCampos(){
        alert = AlertDialog.Builder(this)
        alert.setTitle("ATENCION")
            .setMessage("Este es mi primera alerta para el usuario")
            .setPositiveButton("Aceptar"){dialogInterface, it ->
               // Toast.makeText(this, "He pulsado Aceptar", Toast.LENGTH_LONG).show()

                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
            .setNegativeButton("Cancelar"){dialogInterface, it ->
            }
            .setNeutralButton("Ayuda"){dialogInterface, it ->
            }
            .show()
    }

}