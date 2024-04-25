package com.example.recyclemotos

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclemotos.adapter.SuperMotosAdapter
import com.example.recyclemotos.adapter.SuperMotosHorizontalAdapter

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerView()

    }

    private fun initRecyclerView(){
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerMotos)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = SuperMotosAdapter(SuperMotosProvider.supermotosList)

        val recyclerViewHorizontal = findViewById<RecyclerView>(R.id.recyclerMotosHorizontal)
        recyclerViewHorizontal.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerViewHorizontal.adapter = SuperMotosHorizontalAdapter(SuperMotosProvider.supermotosList)

    }
}