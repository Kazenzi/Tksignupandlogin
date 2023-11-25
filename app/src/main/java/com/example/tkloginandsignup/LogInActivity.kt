package com.example.tkloginandsignup

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class LogInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)

        val forgotpassword:TextView=findViewById(R.id.textView3)
        val logbth:Button=findViewById(R.id.button)
        val userjina:EditText=findViewById(R.id.editTextTextPersonName)
        val usersiri:EditText=findViewById(R.id.editTextTextPersonName2)

//        setlistener
        logbth.setOnClickListener {
            val userjina=userjina.text.toString()
            val usersiri=usersiri.text.toString()

            if(
                userjina.isNotEmpty() && usersiri.isNotEmpty()
            ){
            val intent=Intent(this,
                HomeMainActivity2::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this,"Please input all fields",Toast.LENGTH_SHORT).show()
        }
        }
    }
}