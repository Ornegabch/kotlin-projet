package com.example.tpsigeris

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityCompteurBinding
import com.example.tpsigeris.databinding.ActivityConvertisseurBinding
import com.example.tpsigeris.databinding.ActivityJeuBinding

class Jeu : AppCompatActivity() {
    private lateinit var binding: ActivityJeuBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityJeuBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // setContentView(R.layout.activity_convertisseur)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnPlay.setOnClickListener {
            val random = (1..6).random()
            when (random) {
                1 -> binding.dice.setImageResource(R.drawable.one)
                2 -> binding.dice.setImageResource(R.drawable.two)
                3 -> binding.dice.setImageResource(R.drawable.three)
                4 -> binding.dice.setImageResource(R.drawable.four)
                5 -> binding.dice.setImageResource(R.drawable.five)
                6 -> binding.dice.setImageResource(R.drawable.six)
            }
        }
            }
        }