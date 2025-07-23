package com.example.final_project

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.final_project.databinding.ActivityMainBinding
import com.example.final_project.databinding.ActivityOtpPageBinding

class otp_page : AppCompatActivity() {
    lateinit var binding: ActivityOtpPageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOtpPageBinding.inflate(layoutInflater)
        setContentView(binding.root)

        enableEdgeToEdge()
        setContentView(R.layout.activity_otp_page)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val gotohome = findViewById<Button>(R.id.btnSubmit)
        gotohome.setOnClickListener {
            val intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
    }
}