package com.raulcastaneda.concatenar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnIngresar.setOnClickListener {
            val num1 = txtnum1.text.toString().toInt()
            val num2 = txtnum2.text.toString().toInt()

            if (num1.equals("") or num2.equals("")) {
                mensaje("Datos vacios", Toast.LENGTH_LONG)
            } else {
                    mensaje(""+num1+num2)
                }
            }
        }
    fun mensaje(mensaje:String,dur:Int=Toast.LENGTH_SHORT) {
        Toast.makeText(this,mensaje,dur).show()
    }
}
