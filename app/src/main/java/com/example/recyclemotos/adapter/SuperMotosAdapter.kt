package com.example.recyclemotos.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclemotos.R
import com.example.recyclemotos.SuperMotos

class SuperMotosAdapter (private val supermotosList:List<SuperMotos>) : RecyclerView.Adapter<SuperMotosViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperMotosViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return SuperMotosViewHolder(layoutInflater.inflate(R.layout.item_supermotos, parent, false))
    }

    override fun onBindViewHolder(holder: SuperMotosViewHolder, position: Int) {
        val item = supermotosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = supermotosList.size

}