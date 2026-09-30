package com.example.damapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val etUsername = findViewById<EditText>(R.id.etUsername)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val btnLogin = findViewById<Button>(R.id.btnLogin)

        btnLogin.setOnClickListener {
            val username = etUsername.text.toString().trim()
            val password = etPassword.text.toString().trim()

            when {
                username.isEmpty() || password.isEmpty() -> {
                    Toast.makeText(this, "Completa usuario y contraseña por favor", Toast.LENGTH_SHORT).show()
                }
                username != "Admin" || password != "1234" -> {
                    Toast.makeText(this, "Usuario o contraseña incorrectos", Toast.LENGTH_SHORT).show()
                }
                else -> {
                    Toast.makeText(this, "¡Bienvenido!", Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}