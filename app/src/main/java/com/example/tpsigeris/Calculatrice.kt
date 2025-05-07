package com.example.tpsigeris
import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityCalculatriceBinding

class Calculatrice : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatriceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        var nbre1: Int = 0
        var nbre2: Int = 0
        var add: Boolean = false
        var sub = false
        var mul = false
        var div = false
        binding = ActivityCalculatriceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
       //setContentView(R.layout.activity_calculatrice)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->

            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())

            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)

            insets
        }
        binding.btnEgal.setOnClickListener {
            if (add || sub || mul || div) {
                nbre2 = binding.txtResultat.text.toString().toIntOrNull() ?: 0
            }
            if (add) {
                binding.txtResultat.setText((nbre1 + nbre2).toString())
                add = false
            }
            if (sub) {
                binding.txtResultat.setText((nbre1 - nbre2).toString())
                sub = false
            }
            if (mul) {
                binding.txtResultat.setText((nbre1 * nbre2).toString())
            }
            if (div) {
                if (nbre2 != 0) {
                    binding.txtResultat.setText((nbre1 / nbre2).toString())
                  div = false
                } else {
                    binding.txtResultat.setText("Error") // Handle division by zero
                    div = false
                }
            }
        }
        binding.btnAdd.setOnClickListener {
            nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?: 0
            add = true
         }
        binding.btnSous.setOnClickListener {
            nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?: 0
            sub = true
            binding.txtResultat.text = null
        }
        binding.btnMult.setOnClickListener {
            nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?: 0
            mul = true
            binding.txtResultat.text = null
        }

        binding.btnDiv.setOnClickListener {
            nbre1 = binding.txtResultat.text.toString().toIntOrNull() ?: 0
            div = true
            binding.txtResultat.text = null
        }
        binding.btnClear.setOnClickListener {
            nbre1 = 0
            nbre2 = 0
            binding.txtResultat.text = null
        }
    }
    fun operationsNombre(btn: View) {
        val button: Button = btn as Button
        binding.txtResultat.append(button.text)
    }
}
