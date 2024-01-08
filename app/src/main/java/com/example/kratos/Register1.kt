package com.example.kratos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class Register1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register1)

        val Btn = findViewById<Button>(R.id.button2)
        Btn.setOnClickListener {
            val Intent = Intent(this, Register2::class.java)
            startActivity(Intent)
        }

        val Btn1 = findViewById<TextView>(R.id.textView4)
        Btn1.setOnClickListener {
            val Intent = Intent(this, Login1::class.java)
            startActivity(Intent)
        }
    }
}