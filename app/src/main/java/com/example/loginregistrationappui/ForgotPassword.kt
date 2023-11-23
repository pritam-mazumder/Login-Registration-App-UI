package com.example.loginregistrationappui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregistrationappui.databinding.ActivityForgotPasswordBinding

class ForgotPassword : AppCompatActivity() {

    private lateinit var binding: ActivityForgotPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForgotPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        binding.flogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        binding.fsendcode.setOnClickListener {
            startActivity(Intent(this, OTPVerification::class.java))
            finish()
        }

    }
}