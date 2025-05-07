package com.example.tpsigeris

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityConvertisseurBinding

class Convertisseur : AppCompatActivity() {
    private lateinit var binding: ActivityConvertisseurBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityConvertisseurBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // setContentView(R.layout.activity_convertisseur)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnConvert.setOnClickListener {
            val dollar = 630
            val a = binding.txtDolar.text.toString()

            binding.txtRes.text = (a.toInt() * dollar).toString() + "FCFA"

        }

    }
}