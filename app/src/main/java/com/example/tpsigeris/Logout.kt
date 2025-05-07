package com.example.tpsigeris

import android.content.Context
import android.content.DialogInterface
import android.content.Intent
import android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK
import android.content.SharedPreferences
import android.os.Bundle
import android.view.Menu
import android.view.View
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityLogoutBinding

class Logout : AppCompatActivity() {
    private lateinit var binding: ActivityLogoutBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_logout)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnDecon.setOnClickListener {
            val sharePref = getSharedPreferences("myPref", MODE_PRIVATE)
            val editor = sharePref.edit()
            //val  context: Context
            /*  val builder = AlertDialog.Builder(this)
              builder.setPositiveButton("OUI") { _, _ ->
                  editor.clear()
                  editor.apply()
                  val intent = Intent(this, Menu::class.java)
                  startActivity(intent)
                  finish()
              }
              builder.setNegativeButton("ANNULER") { _, _ ->
                  builder.setTitle("Deconnexion")
                  builder.setMessage("etes vous sure de vouloir vous deconnecter?")
                  builder.show()

        }
    }

            val builder: AlertDialog.Builder = AlertDialog.Builder(this)

            builder
                .setMessage("I am the message")
                .setTitle("I am the title")
                .setPositiveButton("Positive") { dialog, which ->
                    // Do something.
                }
                .setNegativeButton("Negative") { dialog, which ->
                    // Do something else.
                }

            val dialog: AlertDialog = builder.create()
            dialog.show()}*/

            val positiveButtonClick = { dialog: DialogInterface, which: Int ->
                Toast.makeText(
                    applicationContext,
                    android.R.string.yes, Toast.LENGTH_SHORT
                ).show()
            }
            val negativeButtonClick = { dialog: DialogInterface, which: Int ->
                Toast.makeText(
                    applicationContext,
                    android.R.string.no, Toast.LENGTH_SHORT
                ).show()
            }
            val neutralButtonClick = { dialog: DialogInterface, which: Int ->
                Toast.makeText(
                    applicationContext,
                    "Maybe", Toast.LENGTH_SHORT
                ).show()
            }

            fun basicAlert(view: View) {

                val builder = AlertDialog.Builder(this)

                with(builder)
                {
                    setTitle("Androidly Alert")
                    setMessage("We have a message")
                    setPositiveButton(
                        "OK",
                        DialogInterface.OnClickListener(function = positiveButtonClick)
                    )
                    setNegativeButton(android.R.string.no, negativeButtonClick)
                    setNeutralButton("Maybe", neutralButtonClick)
                    show()
                }
            }
        }
    }
}
