package com.example.login1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inicioSesion: Button = findViewById(R.id.button)
        val regitrarse: Button = findViewById(R.id.button2)
        val cambiarContrasenya: TextView = findViewById(R.id.textView2)
        val inicioGoogle: ImageButton = findViewById(R.id.imageButton)
        val inicioFacebook: ImageButton = findViewById(R.id.imageButton2)


        inicioSesion.setOnClickListener {
            Toast.makeText(this, "Iniciando sesión", Toast.LENGTH_SHORT).show()
        }

        regitrarse.setOnClickListener {
            Toast.makeText(this, "Página de registro", Toast.LENGTH_SHORT).show()
        }

        cambiarContrasenya.setOnClickListener {
            Toast.makeText(this, "Cambiar contraseña", Toast.LENGTH_SHORT).show()
        }

        inicioGoogle.setOnClickListener {
            Toast.makeText(this, "Inicio con Google", Toast.LENGTH_SHORT).show()
        }

        inicioFacebook.setOnClickListener {
            Toast.makeText(this, "Inicio con Facebook", Toast.LENGTH_SHORT).show()
        }

    }
}