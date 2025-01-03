package com.gabrieldev.androidmaster

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.gabrieldev.androidmaster.IMCcalculator.IMCcalculatorActivity
import com.gabrieldev.androidmaster.TODOapp.TodoActivity
import com.gabrieldev.androidmaster.firtsApp.firtsAppActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnIMCApp = findViewById<Button>(R.id.btnIMCApp)
        val btnTODOApp = findViewById<Button>(R.id.btnTODOApp)
        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnIMCApp.setOnClickListener { navigateToIMCApp() }
        btnTODOApp.setOnClickListener { navigateToTODOApp() }


    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, firtsAppActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToIMCApp() {
        val intent = Intent(this, IMCcalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToTODOApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }
}
