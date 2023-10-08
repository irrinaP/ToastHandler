package com.example.toasthandler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var mybutton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mybutton = findViewById(R.id.button_OK)
        mybutton.setOnClickListener{ showToast()}
    }
    private fun showToast(){
    val myToast = Toast.makeText(this, "Вы нажалик кнопку, а зачем?", Toast.LENGTH_LONG)
    myToast.show()
    }
}