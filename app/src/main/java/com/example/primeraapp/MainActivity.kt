package com.example.primeraapp

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var emailText:String = ""
    var passwordText:String = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var loginButton:Button = findViewById(R.id.btn_login)
        var et_email:EditText = findViewById(R.id.et_email)
        var et_password:EditText = findViewById(R.id.et_password)

        loginButton.setOnClickListener {

            emailText = et_email.text.toString()
            passwordText = et_password.text.toString()


            if (et_email.text.isEmpty()) {
                Toast.makeText(this,"DEBE RELLENAR EL EMAIL",Toast.LENGTH_LONG).show()

            } else if (et_password.text.isEmpty()) {
                Toast.makeText(this,"DEBE RELLENAR LA CONTRASEÑA",Toast.LENGTH_LONG).show()

            } else if (et_email.text.isEmpty() && et_password.text.isEmpty()) {
                Toast.makeText(this,"DEBE RELLENAR EL EMAIL",Toast.LENGTH_LONG).show()

            } else {
                Toast.makeText(this, "PERFECTO", Toast.LENGTH_LONG).show()

                val intent = Intent(this, HomeActivity::class.java)
                intent.putExtra("email",emailText)
                startActivity(intent)
            }
        }
    }

    fun loginButtonClick(){
        Toast.makeText(this,"He pulsado el boton",Toast.LENGTH_LONG).show()
    }


}

