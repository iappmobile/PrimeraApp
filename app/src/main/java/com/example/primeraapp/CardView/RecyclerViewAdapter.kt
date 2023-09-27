package com.example.primeraapp.CardView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.primeraapp.R


class RecyclerViewAdapter: RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>() {

    var names = arrayOf("Juan", "Pepe", "Luis", "Pedro")
    var phones = arrayOf("111111111", "222222222", "3333333333", "4444444444")
    var imagenes = intArrayOf(R.drawable.imagen2,
        R.drawable.imagen1,
        R.drawable.imagen1,
        R.drawable.imagen1)

    inner class ViewHolder(itemView:View):RecyclerView.ViewHolder(itemView){
        var name:TextView = itemView.findViewById(R.id.tv_name)
        var phone:TextView = itemView.findViewById(R.id.tv_phone)
        var imagen:ImageView = itemView.findViewById(R.id.user_image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view:View = LayoutInflater.from(parent.context).inflate(R.layout.primer_cardview, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return names.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.name.text = names[position]
        holder.phone.text = phones[position]
        holder.imagen.setImageResource(imagenes[position])

        holder.itemView.setOnClickListener {

        }
    }



}