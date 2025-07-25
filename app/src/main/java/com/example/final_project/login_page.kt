package com.example.final_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.final_project.databinding.ActivityLoginPageBinding
import com.example.final_project.databinding.ActivityMainBinding

class login_page : AppCompatActivity() {
    lateinit var binding: ActivityLoginPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityLoginPageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        enableEdgeToEdge()
//        setContentView(R.layout.activity_login_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val gotootp = findViewById<Button>(R.id.btnlogin)
        gotootp.setOnClickListener {
            val intent = Intent(this, otp_page::class.java)
            startActivity(intent)
        }

        val gotoreset = findViewById<TextView>(R.id.forgetpassword)
        gotoreset.setOnClickListener {
            val intent = Intent(this, reset_password::class.java)
            startActivity(intent)
        }
    }
}