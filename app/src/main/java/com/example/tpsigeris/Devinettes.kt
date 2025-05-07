package com.example.tpsigeris

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Devinettes : AppCompatActivity() {
    private lateinit var txt_nb: EditText;
    private lateinit var btn_submit: Button;
    private lateinit var btn_reset: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_devinettes)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        txt_nb = findViewById(R.id.txt_nb)
        btn_submit = findViewById(R.id.btn_submit)
        btn_reset = findViewById(R.id.btn_reset)
        btn_submit.setOnClickListener {
                val number = txt_nb.text.toString().toInt()
                if (number < 0 || number > 20) {
                    Toast.makeText(this, "ce nombre est incorrect, veuillez saisir un nouveau nombre", Toast.LENGTH_SHORT).show()
                } else {
                    txt_nb.setText("ce nombre est correct")
                }
        }
        btn_reset.setOnClickListener {
            txt_nb.text.clear()

        }
        }
    }
