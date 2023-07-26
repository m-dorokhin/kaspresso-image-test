package com.example.kaspressoimagetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = layoutInflater.inflate(R.layout.activity_main, null)
        setContentView(layout)
    }
}