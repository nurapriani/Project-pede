package com.example.pede

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        loadFragment(Beranda())
        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {

            when (it.itemId) {
                R.id.beranda -> {
                    loadFragment(Beranda())
                    return@setOnItemSelectedListener true
                }
                R.id.baca -> {
                    loadFragment(Baca())
                    return@setOnItemSelectedListener true
                }
                R.id.komik -> {
                    loadFragment(Komik())
                    return@setOnItemSelectedListener true
                }
                R.id.video -> {
                    loadFragment(Video())
                    return@setOnItemSelectedListener true
                }
                R.id.curhat -> {
                    loadFragment(Curhat())
                    return@setOnItemSelectedListener true
                }

            }
            false
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment)
        transaction.commit()
    }

    fun openFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }

    fun openBaca() {
        bottomNav.selectedItemId = R.id.baca
    }
    fun openKomik() {
        bottomNav.selectedItemId = R.id.komik
    }
    fun openVideo() {
        bottomNav.selectedItemId = R.id.video
    }
    fun openCurhat() {
        bottomNav.selectedItemId = R.id.curhat
    }
    fun openSurvey() {
        loadFragment(Survey())
    }

}
