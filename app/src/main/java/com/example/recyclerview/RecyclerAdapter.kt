package com.example.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerAdapter :RecyclerView.Adapter<ViewHolderItem>(){
    private val animalList = listOf(
        "ライオン", "クマ", "キリン", "ゾウ", "パンダ", "まんこ", "翼", "コアラ", "さる", "ヒョウ", "うさぎ", "ゴリラ",
        "ライオン", "クマ", "キリン", "ゾウ", "パンダ", "まんこ", "翼", "コアラ", "さる", "ヒョウ", "うさぎ", "ゴリラ"
    )

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderItem {
        val itemXml = LayoutInflater.from(parent.context)
            .inflate(R.layout.one_layout, parent, false)
        return ViewHolderItem(itemXml)
    }

    override fun getItemCount(): Int = animalList.size

    override fun onBindViewHolder(holder: ViewHolderItem, position: Int) {
        holder.itemName.text = animalList[position]
    }
}