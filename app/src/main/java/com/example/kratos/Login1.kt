package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView

class Login1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login1)

        val Btn = findViewById<TextView>(R.id.textView93)
        Btn.setOnClickListener {
            val Intent = Intent(this, Register1::class.java)
            startActivity(Intent)
        }
    }
}