package com.example.latifah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {

    lateinit var tv2 : TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        var str1 = intent.extras?.get("Name")
        var str2 = intent.extras?.get("Location")
        var str3 = intent.extras?.get("Mobile")

        tv2 = findViewById(R.id.tv2)
        val st = "Name : ${str1} \n Location :${str2} \n Mobile : ${str3}"

        tv2.text = st
    }
}