package com.example.recyclerview

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

class ViewHolderItem(itemView:View) : RecyclerView.ViewHolder(itemView) {
    //view(xml)からidを見つける
    val itemName:TextView = itemView.findViewById(R.id.tv)

    //クリック処理
    //リサイクラークラス全体を取得
    private val recyclerAdapter = RecyclerAdapter()
    private val animalList = recyclerAdapter.animalList

    init {
        itemView.setOnClickListener{
            val position:Int = adapterPosition
            Toast.makeText(itemView.context,animalList[position],Toast.LENGTH_SHORT).show()
        }
    }

}