package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //id取得
        recyclerView = findViewById(R.id.rv)
        recyclerView.adapter = RecyclerAdapter()
        //縦に並べる
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}