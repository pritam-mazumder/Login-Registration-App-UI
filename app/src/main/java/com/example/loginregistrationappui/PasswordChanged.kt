package com.example.loginregistrationappui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregistrationappui.databinding.ActivityPasswordChangedBinding

class PasswordChanged : AppCompatActivity() {

    private lateinit var binding: ActivityPasswordChangedBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPasswordChangedBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.backToLogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
        }
    }
}