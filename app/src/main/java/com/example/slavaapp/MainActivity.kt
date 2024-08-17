package com.example.slavaapp

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val label = findViewById<TextView>(R.id.textView2)
        val num1:Button = findViewById(R.id.button1)
        val num2:Button = findViewById(R.id.button2)
        val num3:Button = findViewById(R.id.button3)
        val num4:Button = findViewById(R.id.button6)
        val num5:Button = findViewById(R.id.button4)
        val num6:Button = findViewById(R.id.button5)
        val num7:Button = findViewById(R.id.button7)
        val num8:Button = findViewById(R.id.button9)
        val num9:Button = findViewById(R.id.button8)
        val num0:Button = findViewById(R.id.button0)
        val numPlus:Button = findViewById(R.id.buttonPlus)
        val numMinus:Button = findViewById(R.id.buttonMinus)
        val numMultiplication:Button = findViewById(R.id.buttonMultiplication)
        val numRovno:Button = findViewById(R.id.buttonEvenly)
        val numDivision:Button = findViewById(R.id.buttonDivision)
        val numC:Button = findViewById(R.id.buttonC)
        val hystory:Button = findViewById(R.id.history)
        val hystory_close:Button = findViewById(R.id.historyClose)
        var number1 = label.text.toString().trim()
        var deystvie = ""
        val historyText = findViewById<TextView>(R.id.textView)
        var hist = mutableListOf(0)

        num1.setOnClickListener{
            val text  = "1"
            label.text = (label.text.toString()) + text
        }
        num2.setOnClickListener{
            val text  = "2"

            label.text = (label.text.toString()) + text
        }
        num3.setOnClickListener{
            val text  = "3"
            label.text = (label.text.toString()) + text
        }
        num4.setOnClickListener{
            val text  = "4"
            label.text = (label.text.toString()) + text
        }
        num5.setOnClickListener{
            val text  = "5"
            label.text = (label.text.toString()) + text
        }
        num6.setOnClickListener{
            val text  = "6"
            label.text = (label.text.toString()) + text
        }
        num7.setOnClickListener{
            val text  = "7"
            label.text = (label.text.toString()) + text
        }
        num8.setOnClickListener{
            val text  = "8"
            label.text = (label.text.toString()) + text
        }
        num9.setOnClickListener{
            val text  = "9"
            label.text = (label.text.toString()) + text
        }
        num0.setOnClickListener{
            val text  = "0"
            label.text = (label.text.toString()) + text
        }
        numPlus.setOnClickListener(){
            number1 = label.text.toString().trim()
            label.text = ""
            deystvie = "+"
        }
        numMinus.setOnClickListener(){
            number1 = label.text.toString().trim()
            label.text = ""
            deystvie = "-"
        }
        numMultiplication.setOnClickListener(){
            number1 = label.text.toString().trim()
            label.text = ""
            deystvie = "*"
        }
        numDivision.setOnClickListener(){
            number1 = label.text.toString().trim()
            label.text = ""
            deystvie = "/"
        }
        numC.setOnClickListener(){
            number1 = ""
            label.text = ""
        }

        numRovno.setOnClickListener{
            val number2 = label.text.toString().trim()
            if(deystvie == "+"){
                label.text = (number1.toInt() + number2.toInt()).toString()
                hist.add(number1.toInt() + number2.toInt())
            }else if (deystvie == "-"){
                label.text = (number1.toInt() - number2.toInt()).toString()
                hist.add(number1.toInt() - number2.toInt())}
            else if (deystvie == "*"){
                label.text = (number1.toInt() * number2.toInt()).toString()
                hist.add(number1.toInt() * number2.toInt())}
            else if (deystvie == "/"){
                label.text = (number1.toInt() / number2.toInt()).toString()
                hist.add(number1.toInt() + number2.toInt())}
        }
        hystory.setOnClickListener{
            val historyText = findViewById<TextView>(R.id.textView)
            val array_size = hist.size
            for (i in 0..array_size-1){
                historyText.text = (historyText.text).toString() + hist[i].toString() + " "
            }
        }
        hystory_close.setOnClickListener{
            historyText.text = ""
            hist.clear()
        }
    }
}