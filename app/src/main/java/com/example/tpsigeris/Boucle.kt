package com.example.tpsigeris

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Boucle : AppCompatActivity() {
    private lateinit var edt_debut: EditText;
    private lateinit var edt_fin: EditText;
    private lateinit var txt_res: TextView;
    private lateinit var btn_for: Button;
    private lateinit var btn_while: Button;
    private lateinit var btn_dowhile: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_boucle)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        edt_debut = findViewById(R.id.edt_debut);
        edt_fin = findViewById(R.id.edt_fin);
        txt_res = findViewById(R.id.txt_res);
        btn_for = findViewById(R.id.btn_for);
        btn_while = findViewById(R.id.btn_while);
        btn_dowhile = findViewById(R.id.btn_dowhile);
        btn_for.setOnClickListener {
            txt_res.text = null
            val debut = edt_debut.text.toString().toInt()
            val fin = edt_fin.text.toString().toInt()
            val i = edt_debut
            for (i in debut..fin) {
                txt_res.text = "${txt_res.text.toString()},$i"

            }
        }
        btn_while.setOnClickListener {
            txt_res.text = ""

            val debut = edt_debut.text.toString().toInt()

            val fin = edt_fin.text.toString().toInt()
            var i = debut
            while (i <= fin) {
                txt_res.text = "${txt_res.text.toString()},$i"
                i++
            }
            }
        btn_dowhile.setOnClickListener {
            txt_res.text = ""

            val debut = edt_debut.text.toString().toInt()

            val fin = edt_fin.text.toString().toInt()
            var i = debut
            do {
                txt_res.text = "${txt_res.text.toString()},$i"
                i++
            }
            while (i <= fin)
        }
        }
        }





