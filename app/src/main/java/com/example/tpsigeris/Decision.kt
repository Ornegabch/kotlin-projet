package com.example.tpsigeris

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Decision : AppCompatActivity() {
    private lateinit var nb1: EditText;
    private lateinit var nb2: EditText;
    private lateinit var textView9: TextView;
    private lateinit var checkBox: CheckBox;
    private lateinit var checkBox6: CheckBox;
    private lateinit var checkBox2: CheckBox;
    private lateinit var checkBox3: CheckBox;
    private lateinit var checkBox4: CheckBox;
    private lateinit var checkBox5: CheckBox;
    private lateinit var button: Button;
    private lateinit var btn_res: Button;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_decision)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        nb1 = findViewById(R.id.nb1);
        nb2 = findViewById(R.id.nb2);
        textView9 = findViewById(R.id.textView9);
        checkBox = findViewById(R.id.checkBox);
        checkBox6 = findViewById(R.id.checkBox6);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        checkBox4 = findViewById(R.id.checkBox4);
        checkBox5 = findViewById(R.id.checkBox5);
        button = findViewById(R.id.button);
        btn_res = findViewById(R.id.btn_res);

        checkBox.setOnClickListener {
            checkBox6.isChecked = false;
            checkBox2.isChecked = false;
            checkBox3.isChecked = false;
            checkBox4.isChecked = false;
            checkBox5.isChecked = false;

        }
        checkBox6.setOnClickListener {
            checkBox.isChecked = false;
            checkBox2.isChecked = false;
            checkBox3.isChecked = false;
            checkBox4.isChecked = false;
            checkBox5.isChecked = false;

        }
        checkBox2.setOnClickListener {
            checkBox.isChecked = false;
            checkBox6.isChecked = false;
            checkBox3.isChecked = false;
            checkBox4.isChecked = false;
            checkBox5.isChecked = false;

        }
        checkBox3.setOnClickListener {
            checkBox.isChecked = false;
            checkBox6.isChecked = false;
            checkBox2.isChecked = false;
            checkBox4.isChecked = false;
            checkBox5.isChecked = false;

        }
        checkBox4.setOnClickListener {
            checkBox.isChecked = false;
            checkBox6.isChecked = false;
            checkBox3.isChecked = false;
            checkBox2.isChecked = false;
            checkBox5.isChecked = false;

        }
        checkBox5.setOnClickListener {
            checkBox.isChecked = false;
            checkBox6.isChecked = false;
            checkBox3.isChecked = false;
            checkBox4.isChecked = false;
            checkBox2.isChecked = false;

        }

        button.setOnClickListener {
            if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()) {
                Toast.makeText(this, "remplir les champs", Toast.LENGTH_SHORT).show()
            } else {
                if (checkBox.isChecked) {
                    textView9.setText(
                        (nb1.text.toString().toInt() + nb2.text.toString().toInt()).toString()
                    )
                }
            }



                if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()) {
                    Toast.makeText(this, "remplir les champs", Toast.LENGTH_SHORT).show()
                } else {
                    if (checkBox5.isChecked) {
                        textView9.setText(
                            (nb1.text.toString().toInt() / nb2.text.toString().toInt()).toString()
                        )
                    }
                }


                if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()) {
                    Toast.makeText(this, "remplir les champs", Toast.LENGTH_SHORT).show()
                } else {
                    if (checkBox6.isChecked) {
                        val result =
                            Math.pow(nb1.text.toString().toDouble(), nb2.text.toString().toDouble())
                        textView9.setText(result.toString())

                    }
                }


                if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()) {
                    Toast.makeText(this, "remplir les champs", Toast.LENGTH_SHORT).show()
                } else {
                    if (checkBox3.isChecked) {
                        textView9.setText(
                            (nb1.text.toString().toInt() - nb2.text.toString().toInt()).toString()
                        )
                    }
                }



                if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()) {
                    Toast.makeText(this, "remplir les champs", Toast.LENGTH_SHORT).show()
                } else {
                    if (checkBox4.isChecked) {
                        textView9.setText(
                            (nb1.text.toString().toInt() * nb2.text.toString().toInt()).toString()
                        )
                    }
                }



                if (nb1.text.toString().isEmpty() || nb2.text.toString().isEmpty()) {
                    Toast.makeText(this, "remplir les champs", Toast.LENGTH_SHORT).show()
                } else {
                    if (checkBox5.isChecked) {
                        textView9.setText(
                            (nb1.text.toString().toInt() % nb2.text.toString().toInt()).toString()
                        )
                    }
                }


            btn_res.setOnClickListener {
                nb1.text.clear()
                nb2.text.clear()
                textView9.text = "0"

            }

        }
    }
}