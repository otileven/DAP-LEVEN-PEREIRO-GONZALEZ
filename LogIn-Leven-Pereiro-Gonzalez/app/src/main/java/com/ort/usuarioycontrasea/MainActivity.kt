package com.ort.usuarioycontrasea

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    lateinit var btn: Button
    lateinit var input: EditText
    lateinit var inputPSWR: EditText
    lateinit var label: TextView
    var user: MutableList<String> = mutableListOf()
    var password: MutableList<String> = mutableListOf()
    var inputText: String = ""
    var str_user = ""
    var str_pass = ""

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn = findViewById(R.id.button)
        input = findViewById(R.id.edit_txt_user)
        label = findViewById(R.id.textView)
        inputPSWR = findViewById(R.id.edit_txt_pwr)
        user.add("Ari.Dayan")
        user.add("Liam.Polo")
        password.add("1234")
        password.add("5678")
        label.text = ""

        btn.setOnClickListener {
            inputText = input.text.toString()
            str_pass = inputPSWR.text.toString()


            if ((inputText.isNotEmpty()) || (str_pass.isNotEmpty())) {

            } else {
                Snackbar.make(it, "ingrese usuario y/o", Snackbar.LENGTH_SHORT).show()
            }
            // (str_pass == password) &&(inputText == user)
            if ((user.contains(inputText) == true) && (password.contains(str_pass) == true)) {

                if ((inputText == "Ari.Dayan") && (str_pass == "1234")) {

                    Snackbar.make(it, "sesion iniciada", Snackbar.LENGTH_SHORT).show()

                }
                if ((inputText == "Liam.Polo") && (str_pass == "5678")) {

                    Snackbar.make(it, "sesion iniciada", Snackbar.LENGTH_SHORT).show()
                } else {
                    Snackbar.make(it, "usuario y/o contraseña incorrectas", Snackbar.LENGTH_SHORT)
                        .show()


                }
            }


        }
    }
}
