package com.example.zadanie1

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.EditText
import android.widget.TextView

class FierdActivity : AppCompatActivity() {
    lateinit var text: TextView
    lateinit var result: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fierd)
        text = findViewById(R.id.CenterFierd);
        result=findViewById(R.id.editTextInput1)
        var text2= intent.getStringExtra("Number")
        var result2= intent.getStringExtra("Res")
        text.setText("Введенное число: $text2")
        result.setText(result2)
    }



    fun registr(view: View) {
        val intent = Intent(this, FirstActivity::class.java)
        startActivity(intent)
        finish()

    }
}