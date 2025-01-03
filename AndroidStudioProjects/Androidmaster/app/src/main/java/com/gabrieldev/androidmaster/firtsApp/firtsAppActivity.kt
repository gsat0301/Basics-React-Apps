package com.gabrieldev.androidmaster.firtsApp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.gabrieldev.androidmaster.R

class firtsAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_firts_app)

            //al arrancar la pantalla
            val etName = findViewById<AppCompatEditText>(R.id.etName)
            val btnStart = findViewById<Button>(R.id.btnStart)
        btnStart.setOnClickListener {
        val name =etName.text.toString()
        if (name.isNotEmpty()) {
            val intent = Intent(this, ResultsActivity::class.java)
            intent.putExtra("EXTRA_NAME", name)
            startActivity(intent)}
        }
    }
    }

