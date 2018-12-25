package com.example.nikad.figru

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        logIn()
    }

    private fun logIn() {
        textView.setOnClickListener {
            if (editText.text.toString().isNotEmpty() && editText2.text.toString().isNotEmpty()) {
                val intent = Intent(this, ThirdActivity::class.java)
                startActivity(intent)
            }
        }
    }
}