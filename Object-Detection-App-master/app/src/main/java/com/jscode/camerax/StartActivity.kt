package com.jscode.camerax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.Button



class StartActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)



        val whenpressbutton = findViewById<Button>(R.id.StartButton)

        whenpressbutton.setOnClickListener {

            val Intent = Intent( this ,MainActivity::class.java)

            startActivity(Intent)

        }


    }




}