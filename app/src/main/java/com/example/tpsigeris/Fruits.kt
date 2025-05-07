package com.example.tpsigeris

import android.os.Bundle
import android.widget.EditText
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


class Fruits : AppCompatActivity() {
    private lateinit var txt_banane: EditText;
    private lateinit var btn_ajouter: Button;
    private lateinit var btn_deleter: Button;
    private lateinit var txt_bne: TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_fruits)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        txt_banane = findViewById(R.id.txt_banane);
        btn_ajouter = findViewById(R.id.btn_ajouter);
        btn_deleter = findViewById(R.id.btn_deleter);
        txt_bne = findViewById(R.id.txt_bne);
        var fruits = arrayOfNulls<String>(5)
        var i = 0
        btn_ajouter.setOnClickListener {
            var fruit = txt_banane.text.toString()
            fruits[i] = fruit
            //var x =""

            //txt_bne.setText(x)
            i++
        }
        btn_deleter.setOnClickListener {
            for (k in fruits){
                //x += "$fruit\n"
                txt_bne.setText(k)
            }
        }
    }
}