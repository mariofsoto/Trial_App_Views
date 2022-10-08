package com.example.mytickets.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.mytickets.data.Favorite
import com.example.mytickets.databinding.FavoriteListItemBinding
import com.squareup.picasso.Picasso

class FavoriteViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = FavoriteListItemBinding.bind(view)

    fun render(favoriteModel: Favorite) {
        binding.tvProductTitle.text = favoriteModel.productTitle
        binding.tvProductPrice.text = favoriteModel.productPrice
        binding.tvProductLocation.text = favoriteModel.productLocation
        Picasso.get().load(favoriteModel.productImg).into(binding.ivProductImg)
    }

}