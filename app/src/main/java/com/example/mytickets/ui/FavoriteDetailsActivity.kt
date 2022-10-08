package com.example.mytickets.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytickets.R
import com.example.mytickets.databinding.ActivityFavoriteDetailsBinding
import com.example.mytickets.databinding.ActivityFavoriteListBinding
import com.example.mytickets.databinding.ActivityHomeBinding

class FavoriteDetailsActivity : AppCompatActivity() {

    private lateinit var binding : ActivityFavoriteDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFavoriteDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}