package com.example.tpsigeris

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Fonction : AppCompatActivity() {
    private lateinit var txtNom: EditText
    private lateinit var txtNiveau: EditText
    private lateinit var txtMat: EditText
    private lateinit var txtRes: TextView
    private lateinit var btnEnregistrer: Button
    private lateinit var btnSend: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fonction)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txtNom = findViewById(R.id.txt_nom)
        txtNiveau = findViewById(R.id.txt_niveau)
        txtMat = findViewById(R.id.txt_mat)
        txtRes = findViewById(R.id.txt_res)
        btnEnregistrer = findViewById(R.id.btn_enregistrer)
        btnSend = findViewById(R.id.btn_send)

        btnEnregistrer.setOnClickListener {
            val nom = txtNom.text.toString()
            val niveauString = txtNiveau.text.toString()
            val matString = txtMat.text.toString()
                val niveau = niveauString.toInt()
                val mat = matString.toInt()
                val result = main(nom, niveau, mat)
            txtRes.text = result
            }
        btnSend.setOnClickListener {
            val nom = txtNom.text.toString()
            val niveau = txtNiveau.text.toString()
            val mat = txtMat.text.toString()
            val intent = Intent (this, Liste::class.java )
            intent.putExtra("txtNom",nom)
            intent.putExtra("txtNiveau",niveau)
            intent.putExtra("txtMat", mat)
            startActivity(intent)

        }

        }
    private fun main(nom: String, niveau: Int, mat: Int): String {
        return "Nom: $nom, Niveau: $niveau, Mat: $mat"
    }
}