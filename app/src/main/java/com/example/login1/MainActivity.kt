package com.example.login1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar


class MainActivity : AppCompatActivity()
{

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inicioSesion: Button = findViewById(R.id.button)
        val regitrarse: Button = findViewById(R.id.button2)
        val cambiarContrasenya: TextView = findViewById(R.id.textView2)
        val inicioGoogle: ImageButton = findViewById(R.id.imageButton)
        val inicioFacebook: ImageButton = findViewById(R.id.imageButton2)


        inicioSesion.setOnClickListener {
            val snack = Snackbar.make(it, "Iniciando sesión", Snackbar.LENGTH_LONG)
            snack.show()
        }

        regitrarse.setOnClickListener {
            val snack = Snackbar.make(it, "Página de registro", Snackbar.LENGTH_LONG)
            snack.show()
        }

        cambiarContrasenya.setOnClickListener {
            val snack = Snackbar.make(it, "Cambiar contraseña", Snackbar.LENGTH_LONG)
            snack.show()
        }

        inicioGoogle.setOnClickListener {
            val snack = Snackbar.make(it, "Inicio con Google", Snackbar.LENGTH_LONG)
            snack.show()
        }

        inicioFacebook.setOnClickListener {
            val snack = Snackbar.make(it, "Inicio con Facebook", Snackbar.LENGTH_LONG)
            snack.show()
        }
    }
}