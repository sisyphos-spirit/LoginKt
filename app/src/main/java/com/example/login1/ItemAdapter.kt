package com.example.login1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class ItemAdapter(context: Context, items: List<Item> ) : ArrayAdapter <Item>(context, 0, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View
    {
        var itemView = convertView

        if (itemView == null)
        {
            itemView = LayoutInflater.from(context).inflate(R.layout.listview_item, parent, false)

            val item = getItem(position)

            val img: ImageView = itemView.findViewById(R.id.iv)
            val nombreTextView: TextView = itemView.findViewById(R.id.tvNombreP)
            val moduloTextView: TextView = itemView.findViewById(R.id.tvModulo)

            img.setImageResource(R.drawable.sherlockicon)
            nombreTextView.text = item?.nombre
            moduloTextView.text = item?.modulo
        }
        return itemView!!
    }
}