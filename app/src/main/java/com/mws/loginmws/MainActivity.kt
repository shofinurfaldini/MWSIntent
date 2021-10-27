package com.mws.loginmws

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textSignUp: TextView = findViewById(R.id.textSignUp)

        textSignUp.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, Register::class.java)
            startActivity(intent)
        })
    }
}