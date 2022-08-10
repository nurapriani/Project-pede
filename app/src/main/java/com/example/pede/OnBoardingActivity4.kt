package com.example.pede

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.ImageView
import com.bumptech.glide.Glide

class OnBoardingActivity4 : AppCompatActivity() {
    lateinit var imageView: ImageView
    lateinit var button_next: ImageButton
    lateinit var button_prev: ImageButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_on_boarding4)
        imageView = findViewById(R.id.backgroundImageview) as ImageView
        button_next = findViewById(R.id.btn_next) as ImageButton
        button_prev = findViewById(R.id.btn_prev) as ImageButton
        Glide.with(this).load(R.drawable.bgr_boarding4).into(imageView);
        button_next.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
        button_prev.setOnClickListener {
            startActivity(Intent(this,OnBoardingActivity3::class.java))
        }
    }
}