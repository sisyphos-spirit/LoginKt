package com.example.login1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.login1.databinding.ActivityFavoritosBinding

class FavoritosActivity : AppCompatActivity()
{

    private lateinit var binding: ActivityFavoritosBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityFavoritosBinding.inflate(layoutInflater)

        setContentView(binding.root)

        val profesores = listOf<Item>(Item("", "Lucas", "PMyDM"),
            Item("", "Paco", "DI"),
            Item("", "María José", "PSP"))

        val adapter = ItemAdapter(this, profesores)

        binding.lv.adapter = adapter

        binding.lv.setOnItemClickListener { parent, view, position, id ->
            val selectedItem = parent.getItemAtPosition(position) as Item
            Toast.makeText(applicationContext,
                "Has hecho click en: ${selectedItem.nombre}",
                Toast.LENGTH_LONG).show()
        }

        setContentView(R.layout.activity_favoritos)

    }
}