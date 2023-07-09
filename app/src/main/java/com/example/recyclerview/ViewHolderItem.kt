package com.example.recyclerview

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderItem(itemView:View) : RecyclerView.ViewHolder(itemView) {
    //view(xml)からidを見つける
    val itemName:TextView = itemView.findViewById(R.id.tv)
}