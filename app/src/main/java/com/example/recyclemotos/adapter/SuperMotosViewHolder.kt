package com.example.recyclemotos.adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.recyclemotos.R
import com.example.recyclemotos.SuperMotos

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