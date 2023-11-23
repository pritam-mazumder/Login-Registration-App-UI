package com.example.loginregistrationappui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregistrationappui.databinding.ActivityCreateNewPasswordBinding

class CreateNewPassword : AppCompatActivity() {

    private lateinit var binding: ActivityCreateNewPasswordBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCreateNewPasswordBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.back.setOnClickListener {
            startActivity(Intent(this, OTPVerification::class.java))
        }

        binding.resetPassword.setOnClickListener {
            startActivity(Intent(this, PasswordChanged::class.java))
        }
    }
}