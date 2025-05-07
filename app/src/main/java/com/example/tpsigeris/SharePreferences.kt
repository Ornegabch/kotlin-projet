package com.example.tpsigeris

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityCalculatriceBinding
import com.example.tpsigeris.databinding.ActivitySharePreferencesBinding

class SharePreferences : AppCompatActivity() {
    private lateinit var binding: ActivitySharePreferencesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivitySharePreferencesBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_share_preferences)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val sharePref = getSharedPreferences("myPref", MODE_PRIVATE)
        val editor = sharePref.edit()
        binding.apply {
            btnSave.setOnClickListener {
                val userId = txtId.text.toString()
                val name = txtNom.text.toString()
                editor.apply {
                    putString("userId", userId)
                    putString("name", name)
                    apply()
                }
            }
            btnVw.setOnClickListener {
                val userId = sharePref.getString("userId", null)
                val name = sharePref.getString("name", null)
                resId.text = userId
                resNom.text = name
            }
            btnClr.setOnClickListener {
                resId.text = null
                resNom.text = null
                editor.clear()
                editor.apply()
            }
        }
        }
    }