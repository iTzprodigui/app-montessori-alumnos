package com.example.schoolapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){




    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemFecha: TextView
        var itemMensualidad: TextView
        var itemCantidadPago: TextView

        init {
            itemFecha = itemView.findViewById(R.id.item_fecha)
            itemMensualidad = itemView.findViewById(R.id.item_mensualidad)
            itemCantidadPago = itemView.findViewById(R.id.item_cantidadPago)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_view, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, i: Int) {
        
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}