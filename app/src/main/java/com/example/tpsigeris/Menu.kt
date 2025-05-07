package com.example.tpsigeris

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Menu : AppCompatActivity() {
    private  lateinit var btn_tp1: Button
    private  lateinit var btn_decision: Button
    private lateinit var btn_boucle: Button
    private lateinit var btn_fruits: Button
    private lateinit var  btn_devinette: Button
    private lateinit var btn_nbre: Button
    private lateinit var btn_fonction: Button
    private lateinit var btn_compteur: Button
    private lateinit var btn_convert: Button
    private lateinit var btn_jeu: Button
    private lateinit var btn_conversation: Button
    private lateinit var btn_calculatrice: Button
    private lateinit var btn_share: Button
    private lateinit var btn_log: Button
    private lateinit var btn_dec: Button
    private lateinit var btn_login2: Button
    private lateinit var btn_shim: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btn_tp1 = findViewById(R.id.btn_tp1)
        btn_tp1.setOnClickListener {
            val i = Intent(this, MainActivity::class.java)
            startActivity(i)
        }
        btn_decision = findViewById(R.id.btn_decision)
        btn_decision.setOnClickListener {
            val i = Intent(this, Decision::class.java)
            startActivity(i)
        }
        btn_boucle = findViewById(R.id.btn_boucle)
        btn_boucle.setOnClickListener {
            val i = Intent(this, Boucle::class.java)
            startActivity(i)
        }
        btn_fruits = findViewById(R.id.btn_fruits)
        btn_fruits.setOnClickListener {
            val i = Intent(this, Fruits::class.java)
            startActivity(i)
        }
        btn_devinette = findViewById(R.id.btn_devinette)
        btn_devinette.setOnClickListener {
            val i = Intent(this, Devinettes::class.java)
            startActivity(i)
        }
        btn_nbre = findViewById(R.id.btn_nbre)
        btn_nbre.setOnClickListener {
            val i = Intent(this, NombreSuivent::class.java)
            startActivity(i)
        }
        btn_fonction = findViewById(R.id.btn_fonction)
        btn_fonction.setOnClickListener {
            val i = Intent(this, Fonction::class.java)
            startActivity(i)
        }
        btn_compteur = findViewById(R.id.btn_compteur)
        btn_compteur.setOnClickListener {
            val i = Intent(this, Compteur::class.java)
            startActivity(i)
        }
        btn_convert = findViewById(R.id.btn_convert)
        btn_convert.setOnClickListener {
            val i = Intent(this, Convertisseur::class.java)
            startActivity(i)
        }
        btn_jeu = findViewById(R.id.btn_jeu)
        btn_jeu.setOnClickListener {
            val i = Intent(this, Jeu::class.java)
            startActivity(i)
        }
        btn_conversation = findViewById(R.id.btn_conversation)
        btn_conversation.setOnClickListener {
            val i = Intent(this, Conversation::class.java)
            startActivity(i)
        }
        btn_calculatrice = findViewById(R.id.btn_calculatrice)
        btn_calculatrice.setOnClickListener {
            val i = Intent(this, Calculatrice::class.java)
            startActivity(i)
        }
        btn_share = findViewById(R.id.btn_share)
        btn_share.setOnClickListener {
            val i = Intent(this, SharePreferences::class.java)
            startActivity(i)
        }
        btn_log = findViewById(R.id.btn_log)
        btn_log.setOnClickListener {
            val i = Intent(this, Login::class.java)
            startActivity(i)
        }
        btn_dec = findViewById(R.id.btn_dec)
        btn_dec.setOnClickListener {
            val i = Intent(this, Logout::class.java)
            startActivity(i)
        }
        btn_login2 = findViewById(R.id.btn_login2)
        btn_login2.setOnClickListener{
            val i = Intent(this, Login2::class.java)
            startActivity(i)
        }
        btn_shim = findViewById(R.id.btn_shim)
        btn_shim.setOnClickListener{
            val i = Intent(this, Shimmer::class.java)
            startActivity(i)
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //Inflate the menu ;
        menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    //override fun onOptionsItemSelected(item: MenuItem): Boolean {
      //  return super.onOptionsItemSelected(item)
    }
