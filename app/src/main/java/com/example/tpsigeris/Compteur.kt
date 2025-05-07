package com.example.tpsigeris

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityCompteurBinding

class Compteur : AppCompatActivity() {
    private  lateinit var binding: ActivityCompteurBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCompteurBinding.inflate(layoutInflater)
        val  view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        binding.btnPlus.setOnClickListener {
            binding.txtRes.text = (binding.txtRes.text.toString().toInt()+1).toString()
        }
        binding.btnMoins.setOnClickListener {
            binding.txtRes.text = (binding.txtRes.text.toString().toInt()-1).toString()
        }
        binding.btnVoir.setOnClickListener {
            if( binding.Logo.visibility == View.INVISIBLE){
                binding.Logo.visibility = View.VISIBLE
            }
            else{
                binding.Logo.visibility=View.INVISIBLE
            }
        }
        binding.btnReset.setOnClickListener {
                binding.txtRes.text ="clear"
            binding.txtRes.text = "0"
        }
        binding.btnVoir.setOnClickListener{
                binding.shimmerLogoContainer.showShimmer(true)
                binding.shimmerLogoContainer.startShimmer()
            }
            binding . btnReset.setOnClickListener{
                binding.shimmerLogoContainer.stopShimmer()
                binding.shimmerLogoContainer.hideShimmer()
            }
        }


    }
