package com.example.loginregistrationappui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregistrationappui.databinding.ActivityOtpverificationBinding

class OTPVerification : AppCompatActivity() {

    private lateinit var binding: ActivityOtpverificationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpverificationBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, ForgotPassword::class.java))
            finish()
        }

        binding.otpverify.setOnClickListener {
            startActivity(Intent(this, CreateNewPassword::class.java))
            finish()
        }

    }
}