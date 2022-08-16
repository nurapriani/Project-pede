package com.pede.pede

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide

class OnBoardingActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding)
        imageView = findViewById(R.id.backgroundImageview) as ImageView
        button = findViewById(R.id.btn_next) as ImageButton
        Glide.with(this).load(R.drawable.bgr_boarding1).into(imageView);
        button.setOnClickListener {
            val intent = Intent(this, OnBoardingActivity2::class.java)
            startActivity(intent)
        }
    }
}