package com.example.clickergame

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var damage:Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val label: TextView = findViewById(R.id.textView)

        val myButton: Button = findViewById(R.id.button)
        myButton.setOnClickListener {
            damage+=1
            label.text=damage.toString()
        }


    }
}