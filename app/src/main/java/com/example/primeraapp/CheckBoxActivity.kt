package com.example.primeraapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.Toast

class CheckBoxActivity : AppCompatActivity() {

    var mayor = true
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_box)

        var checkHijos:CheckBox = findViewById(R.id.check_hijos)
        var rButtonEdad:RadioButton = findViewById(R.id.rbutton_edad)
        var rButtonMenor:RadioButton = findViewById(R.id.rbutton_menor)


        checkHijos.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
                Toast.makeText(this,"Tiene hijos", Toast.LENGTH_LONG).show()
            } else {
                Toast.makeText(this,"NO TIENE", Toast.LENGTH_LONG).show()
            }
        }

    rButtonEdad.setOnCheckedChangeListener { buttonView, isChecked ->
        if (mayor==false){
            rButtonEdad.isChecked = false
            mayor = true
            //rButtonMenor.isChecked = true

        }

    }
        rButtonMenor.setOnCheckedChangeListener { buttonView, isChecked ->
           if (mayor == false){
              mayor = true
               rButtonEdad.isChecked = true
              rButtonMenor.isChecked = false
           }






        }

    }
}