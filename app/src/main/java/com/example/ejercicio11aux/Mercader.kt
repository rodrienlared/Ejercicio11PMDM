package com.example.ejercicio11aux

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.ejercicio11aux.databinding.ActivityMercaderBinding

class Mercader : AppCompatActivity() {

    private lateinit var binding: ActivityMercaderBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMercaderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.comerciar.setOnClickListener {
            startActivity(Intent(this, ActivityEnBlanco::class.java))
        }

        binding.continuarMercader.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}