package com.example.mytickets.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mytickets.adapter.FavoriteAdapter
import com.example.mytickets.data.Favorite
import com.example.mytickets.data.FavoriteProvider
import com.example.mytickets.databinding.ActivityFavoriteListBinding
import com.example.mytickets.databinding.ActivityHomeBinding

class FavoriteListActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFavoriteListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    fun initRecyclerView(){
        binding.rvFavoriteList.layoutManager = LinearLayoutManager(this)
        binding.rvFavoriteList.adapter = FavoriteAdapter(FavoriteProvider.favoriteList)
    }
}