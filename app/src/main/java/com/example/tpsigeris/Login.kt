package com.example.tpsigeris

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityLoginBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sharePref = getSharedPreferences("myPref", MODE_PRIVATE)
        if (sharePref.getBoolean("estConnecte", false)){
            val intent = Intent(this@Login, Menu::class.java)
            startActivity(intent)
        }
        binding.apply {
            btnSubmit.setOnClickListener {
                val login = "admin"
                val pass = "admin"
                if (txtUser.text.isEmpty() || txtPwd.text.isEmpty()) {
                    Toast.makeText(this@Login, "bien vouloir remplir tous les champs", Toast.LENGTH_SHORT).show()
                } else {
                    if (txtUser.text.toString().trim() == login && txtPwd.text.toString() == pass) {
                        val intent = Intent(this@Login, Menu::class.java)
                        val editor = sharePref.edit()
                        editor.putString("username", txtUser.text.toString())
                        editor.putString("password", txtPwd.text.toString())
                        editor.putBoolean("estConnecte", true)
                        editor.apply()
                        startActivity(intent)
                    } else {
                        Toast.makeText(this@Login, "identifiant ou mot de passe incorrect", Toast.LENGTH_LONG).show()
                    }
                }
            }
        }
        }
    }
