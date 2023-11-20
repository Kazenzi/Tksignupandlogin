package com.example.tkloginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        accesbutton
       // val joinButton:Button =findViewById(R.id.joinnow)
        val joinbtn : Button = findViewById(R.id.joinnow)
//        setlistner
        joinbtn.setOnClickListener {
//            navigatetologin
            val intent=Intent(
                this,
                LogInActivity::class.java

            )
            startActivity(intent)
        }

    }
}