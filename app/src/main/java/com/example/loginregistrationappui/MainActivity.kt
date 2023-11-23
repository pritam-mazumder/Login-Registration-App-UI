package com.example.loginregistrationappui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.loginregistrationappui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.homelogin.setOnClickListener {
            startActivity(Intent(this, Login::class.java))
            finish()
        }

        binding.homeregister.setOnClickListener {
            startActivity(Intent(this, Register::class.java))
            finish()
        }
    }
}