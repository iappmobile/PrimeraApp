package com.example.primeraapp.CardView

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.primeraapp.R

class CardActivity : AppCompatActivity() {

    var layoutManager:RecyclerView.LayoutManager? = null
    var adapter:RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>? = null
    lateinit var miRecycler : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

        miRecycler = findViewById(R.id.miRecycler)

        layoutManager = LinearLayoutManager(this)
        adapter = RecyclerViewAdapter()
        miRecycler.layoutManager = layoutManager
        miRecycler.adapter = adapter


    }


}