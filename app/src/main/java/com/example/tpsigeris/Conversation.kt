package com.example.tpsigeris

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.tpsigeris.databinding.ActivityConversationBinding
private lateinit var binding: ActivityConversationBinding
class Conversation : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityConversationBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        //setContentView(R.layout.activity_conversation)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        binding.btnCall.setOnClickListener {
            val phoneNumber = binding.txtTel.text.toString()
            val dialIntent = Intent(Intent.ACTION_DIAL)
            dialIntent.data = Uri.parse("tel:$phoneNumber")
            startActivity(dialIntent)
        }
        binding.btnSms.setOnClickListener {
            val phoneNumber = binding.txtTel.text.toString()
            val message = binding.txtSms.text.toString()
            val smsIntent = Intent(Intent.ACTION_SENDTO)
            smsIntent.data = Uri.parse("smsto:$phoneNumber")
            smsIntent.putExtra("sms_body", message)
            smsIntent.putExtra(Intent.EXTRA_TEXT, message)
            startActivity(smsIntent)
        }
    }
}