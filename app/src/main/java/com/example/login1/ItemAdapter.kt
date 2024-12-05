package com.example.login1

import android.content.Context
import android.icu.text.Transliterator.Position
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.login1.databinding.ItemLayoutBinding

class ItemAdapter(private val context: Context, private val items: List<Item> ) : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, ViewType: Int): ItemViewHolder
    {
        val binding = itemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ItemViewHolder (binding)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int)
    {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int
    {
        return items.size
    }

    class ItemViewHolder(private val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root)
    {
        fun bind(data: Item)
        {
            binding.nombre.text = data.nombre
            binding.valor.text = data.valor
            binding.debilidad.text = data.debilidad
            binding.fortaleza.text = data.fortaleza
            binding.iv.setImageResource(data.img)

            if (data.fav)
            {
                binding.fabFav
            }
        }


    }
}