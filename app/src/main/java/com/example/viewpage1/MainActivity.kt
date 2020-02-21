package com.example.viewpage1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragmentPager = ViewPageFragment()

        val manager = supportFragmentManager

        var transaction = manager.beginTransaction()

        transaction.add(R.id.container, fragmentPager)
        transaction.addToBackStack(null)
        transaction.commit()


    }
}
