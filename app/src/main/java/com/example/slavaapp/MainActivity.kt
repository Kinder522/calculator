package com.example.slavaapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val label = findViewById<TextView>(R.id.mainlabel)
        val buttonNumber_1: EditText = findViewById(R.id.num1)
        val buttonNumber_2 :EditText= findViewById(R.id.num2)
        val buttonDeistvie :EditText= findViewById(R.id.deisvie)
        val buttonRavno:Button = findViewById(R.id.button)


        buttonRavno.setOnClickListener{
            val num1 = buttonNumber_1.text.toString().trim()
            val num2 = buttonNumber_2.text.toString().trim()
            val deistvie = buttonDeistvie.text.toString().trim()
            if (deistvie == "+")
                label.text = (num1.toInt() + num2.toInt()).toString()
            else if (deistvie == "-")
                label.text = (num1.toInt() - num2.toInt()).toString()
            else if (deistvie == "*")
                label.text = (num1.toInt() * num2.toInt()).toString()
            else if (deistvie == "/")
                label.text = (num1.toInt() / num2.toInt()).toString()

        }


    }
}