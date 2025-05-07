package com.example.tpsigeris

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    private  lateinit var  nb1: EditText;
    private  lateinit var  nb2: EditText;
    private  lateinit var  txt_res: TextView;
    private  lateinit var  btn_plus: Button;
    private  lateinit var  btn_moins: Button;
    private  lateinit var  btn_mult: Button;
    private  lateinit var  btn_div: Button;
    private  lateinit var  btn_reset: Button;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        nb1 = findViewById(R.id.nb1)
        nb2 = findViewById(R.id.nb2)
        txt_res = findViewById(R.id.txt_res)
        btn_plus = findViewById(R.id.btn_plus)
        btn_moins = findViewById(R.id.btn_moins)
        btn_mult = findViewById(R.id.btn_mult)
        btn_div = findViewById(R.id.btn_div)
        btn_reset = findViewById(R.id.btn_reset)

        btn_plus.setOnClickListener {
            if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()){
                Toast.makeText(this, "rempir les champs", Toast.LENGTH_SHORT).show()
            }else{
                txt_res.setText(somme(nb1.text.toString().toInt() , nb2.text.toString().toInt()).toString())
                //txt_res.setText((nb1.text.toString().toInt() + nb2.text.toString().toInt()).toString())
            }
        }

        btn_moins.setOnClickListener {
            //txt_res.setText(nb1.text.toString() + " - " + nb2.text.toString() + " = " )
            txt_res.setText((nb1.text.toString().toInt() - nb2.text.toString().toInt()).toString())
        }
        btn_mult.setOnClickListener {
            txt_res.setText((nb1.text.toString().toInt() * nb2.text.toString().toInt()).toString())
        }
        btn_div.setOnClickListener {
            if (nb2.text.toString().toInt() == 0) {
                Toast.makeText(this, "MATH ERROR", Toast.LENGTH_SHORT).show()
            }else{
                txt_res.setText((nb1.text.toString().toInt() / nb2.text.toString().toInt()).toString())
            }
        }

        btn_reset.setOnClickListener{
            nb1.text.clear()
            nb2.text.clear()
            txt_res.text ="0"

        }

    }

    private fun somme(i: Int, i1: Int): Int {
        return i+i1
    }
}
