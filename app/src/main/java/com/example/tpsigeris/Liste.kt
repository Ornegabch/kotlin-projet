package com.example.tpsigeris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityJeuBinding
import com.example.tpsigeris.databinding.ActivityListeBinding

class Liste : AppCompatActivity() {
    private lateinit var binding: ActivityListeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityListeBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       // setContentView(R.layout.activity_liste)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val bundle : Bundle?= intent.extras
        val nom=intent.getStringExtra("txtNom")
        val niveau =intent.getStringExtra("txtNiveau")
        val matricule =intent.getStringExtra("txtMat")
        binding.txtNom.text = nom.toString()
        binding.txtNiveau.text= niveau.toString()
        binding.txtMat.text= matricule.toString()
    }
}