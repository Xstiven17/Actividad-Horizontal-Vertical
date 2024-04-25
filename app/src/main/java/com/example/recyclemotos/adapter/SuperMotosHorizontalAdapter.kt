package com.example.recyclemotos.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclemotos.R
import com.example.recyclemotos.SuperMotos

class SuperMotosHorizontalAdapter(private val supermotosList: List<SuperMotos>) :
    RecyclerView.Adapter<SuperMotosHorizontalAdapter.SuperMotosViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperMotosViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_supermotos_horizontal, parent, false)
        return SuperMotosViewHolder(view)
    }
    class SuperMotosViewHolder (view: View):RecyclerView.ViewHolder(view){

        val superMotos = view.findViewById<TextView>(R.id.tvSuperMotoName)
        val marcaName = view.findViewById<TextView>(R.id.tvMarcaName)
        val photo = view.findViewById<ImageView>(R.id.ivSuperMoto)

        fun render(superMotoModel: SuperMotos){
            superMotos.text = superMotoModel.supermotos
            marcaName.text = superMotoModel.publisher
            Glide.with(photo.context).load(superMotoModel.photo).into(photo)


        }
    }

    override fun onBindViewHolder(holder: SuperMotosViewHolder, position: Int) {
        val item = supermotosList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int {
        return supermotosList.size
    }
}