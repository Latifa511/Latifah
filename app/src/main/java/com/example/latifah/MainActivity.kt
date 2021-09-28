package com.example.latifah

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var toabt :Button
    lateinit var tvbt :Button
    lateinit var gobt :Button
    lateinit var edname :EditText
    lateinit var edlaocatin :EditText
    lateinit var edmobile :EditText
    lateinit var tv :TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toabt = findViewById(R.id.button3)
        tvbt = findViewById(R.id.button2)
        gobt = findViewById(R.id.button)
        edname = findViewById(R.id.editTextTextPersonName5)
        edlaocatin = findViewById(R.id.editTextTextPersonName4)
        edmobile = findViewById(R.id.editTextTextPersonName3)
        tv = findViewById(R.id.tv)


        toabt.setOnClickListener {
            val st = "Name : ${edname.text} \n Location :${edlaocatin.text} \n Mobile : ${edmobile.text}"
            Toast.makeText(applicationContext,st,
            Toast.LENGTH_SHORT).show()
        }

        tvbt.setOnClickListener {
            val st = "Name : ${edname.text} \n Location :${edlaocatin.text} \n Mobile : ${edmobile.text}"
            tv.text = st
        }
        gobt.setOnClickListener {
            val intent = Intent(this,MainActivity2::class.java)
            intent.putExtra("Name",edname.text)
            intent.putExtra("Location",edlaocatin.text)
            intent.putExtra("Mobile",edmobile.text)
            startActivity(intent)

        }


    }
}