package com.example.mytickets.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mytickets.databinding.ActivityHomeBinding

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnFavoritesImg.setOnClickListener {
            //val intent = Intent(this, FavoriteListActivity::class.java)
            //startActivity(intent)
            val intent2 = Intent(this, FavoriteDetailsActivity::class.java)
            startActivity(intent2)
        }

        binding.btnAuto.setOnClickListener {
            val intent2 = Intent(this, FavoriteDetailsActivity::class.java)
            startActivity(intent2)
        }
    }

}