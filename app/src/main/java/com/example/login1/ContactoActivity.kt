package com.example.login1

import android.annotation.SuppressLint
import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

class ContactoActivity : AppCompatActivity() {

    private val CALL_PHONE_PERMISSION_REQUEST = 123

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contacto)


        val llamada: Button = findViewById(R.id.button5)
        val email: Button = findViewById(R.id.button6)
        val mensajeria: Button = findViewById(R.id.button7)
        val mapa: Button = findViewById(R.id.button8)

        llamada.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.CALL_PHONE
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                hacerLlamada()
            } else {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.CALL_PHONE),
                    CALL_PHONE_PERMISSION_REQUEST
                )
            }
        }

        email.setOnClickListener {
            mandarEmail()
        }

        mensajeria.setOnClickListener {
            abrirWhatsApp()
        }

        mapa.setOnClickListener {
            if (ContextCompat.checkSelfPermission(
                    this,
                    android.Manifest.permission.ACCESS_FINE_LOCATION
                ) == PackageManager.PERMISSION_GRANTED
            ) {
                abrirMapa()
            } else {
                ActivityCompat.requestPermissions(
                    this,
                    arrayOf(android.Manifest.permission.ACCESS_FINE_LOCATION),
                    CALL_PHONE_PERMISSION_REQUEST
                )
            }


            abrirMapa()

        }

    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        if (requestCode == CALL_PHONE_PERMISSION_REQUEST) {
            if (grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                hacerLlamada()
            }
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    private fun hacerLlamada() {
        val phoneNumber = "1234567890"

        val intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:$phoneNumber"))

        if (intent.resolveActivity(packageManager) != null) {
            startActivity(intent)
        }
    }

    private fun mandarEmail() {
        val email = "1922635@alu.murciaeduca.es"
        val subject = "Login Email PMDM"
        val body = "Si estás leyendo esto, la app funciona correctamente"

        val intent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:")
            putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            putExtra(Intent.EXTRA_SUBJECT, subject)
            putExtra(Intent.EXTRA_TEXT, body)
        }

        startActivity(intent)
    }

    private fun abrirWhatsApp() {
        val url = "https://api.whatsapp.com/send?phone=+34644611678"
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        intent.setPackage("com.whatsapp")
        startActivity(intent)
    }

    private fun abrirMapa() {
        val latitude = "37.605811"
        val longitude = "-0.990161"
        val zoom = "19"

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("geo:$latitude,$longitude?z=$zoom"))
        startActivity(intent)
    }

}