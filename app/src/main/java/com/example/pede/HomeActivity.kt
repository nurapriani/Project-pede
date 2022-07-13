package com.example.pede

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView


class HomeActivity : AppCompatActivity() {
    lateinit var bottomNav : BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        loadFragment(Beranda())
        bottomNav = findViewById(R.id.bottomNavigationView) as BottomNavigationView
        bottomNav.setOnNavigationItemReselectedListener {

            when (it.itemId) {
                R.id.beranda -> {
                    loadFragment(Beranda())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.baca -> {
                    loadFragment(Baca())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.komik -> {
                    loadFragment(Komik())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.video -> {
                    loadFragment(Video())
                    return@setOnNavigationItemReselectedListener
                }
                R.id.curhat -> {
                    loadFragment(Curhat())
                    return@setOnNavigationItemReselectedListener
                }

            }
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout,fragment)
        transaction.addToBackStack(null)
        transaction.commit()
    }


}
