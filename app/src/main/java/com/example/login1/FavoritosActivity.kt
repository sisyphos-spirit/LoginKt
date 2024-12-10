package com.example.login1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.login1.databinding.ActivityFavoritosBinding

class FavoritosActivity : AppCompatActivity()
{

    private lateinit var binding: ActivityFavoritosBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)

        binding = ActivityFavoritosBinding.inflate(layoutInflater)
        val view = binding.root

        setContentView(view)

        val piezas = listOf(
            Item(R.drawable.dama, "Dama", "Valor: 9", "Fortaleza: Versatilidad", "Debilidad: Sobrecarga", false),
            Item(R.drawable.peon, "Peón", "Valor: 1", "Fortaleza: Consistencia", "Debilidad: Monotonía", false),
            Item(R.drawable.caballo, "Caballo", "Valor: 3", "Fortaleza: Alcance", "Debilidad: Maniobrabilidad", false),
            Item(R.drawable.alfil, "Alfil", "Valor: 3", "Fortaleza: Precisión", "Debilidad: Defensa", false),
            Item(R.drawable.torre, "Torre", "Valor: 5", "Fortaleza: Presión", "Debilidad: Velocidad", false),
            Item(R.drawable.rey, "Rey", "Valor: Indefinido", "Fortaleza: Maniobrabilidad", "Debilidad: Vulnerabilidad", false)
        )

        val adapter = ItemAdapter(this, piezas)

        val recyclerView: RecyclerView = findViewById(R.id.rv)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = ItemAdapter(this, piezas)
    }
}