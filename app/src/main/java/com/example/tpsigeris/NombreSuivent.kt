package com.example.tpsigeris

import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.findViewTreeViewModelStoreOwner

class NombreSuivent : AppCompatActivity() {
    private lateinit var nb1: EditText;
    private lateinit var txt_res: TextView;
    private lateinit var btn_submit: Button;
    private lateinit var btn_reset: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_nombre_suivent)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        nb1 = findViewById(R.id.nb1)
        txt_res = findViewById(R.id.txt_res)
        btn_submit = findViewById(R.id.btn_submit)
        btn_reset = findViewById(R.id.btn_reset)

        btn_submit.setOnClickListener {
            val debut = nb1.text.toString().toInt()
            //val fin = nb1
            //txt_res.setText(fin.toString())
            for (i in debut+1..debut+10) {
                txt_res.text = "${txt_res.text.toString()}$i,"
            }
        }
        btn_reset.setOnClickListener {
            nb1.text.clear()


        }
    }
}