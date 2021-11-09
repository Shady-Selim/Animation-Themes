package com.shady.animationthemes

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    lateinit var img1: ImageView
    lateinit var img2: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        img1 = findViewById(R.id.imageView)
        img2 = findViewById(R.id.imageView2)

        img1.clipToOutline = true
        img2.clipToOutline = true

    }
}