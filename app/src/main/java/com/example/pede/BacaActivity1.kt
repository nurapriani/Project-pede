package com.example.pede

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.bumptech.glide.Glide

class BacaActivity1 : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_baca1)
        imageView = findViewById(R.id.backgroundImageview)
        Glide.with(this).load(R.drawable.bgr_).into(imageView);
    }
}