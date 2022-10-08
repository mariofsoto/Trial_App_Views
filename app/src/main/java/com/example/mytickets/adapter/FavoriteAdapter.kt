package com.example.mytickets.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mytickets.R
import com.example.mytickets.data.Favorite

class FavoriteAdapter(private val favoriteList: List<Favorite>) : RecyclerView.Adapter<FavoriteViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return FavoriteViewHolder(layoutInflater.inflate(R.layout.favorite_list_item, parent, false))
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        val item = favoriteList[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = favoriteList.size
}