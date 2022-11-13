package com.project.hamburgerdelivery

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.project.hamburgerdelivery.databinding.ActivityMainBinding
import com.project.hamburgerdelivery.view.Event
import com.project.hamburgerdelivery.view.History
import com.project.hamburgerdelivery.view.home.Home
import com.project.hamburgerdelivery.view.Information

class MainActivity : AppCompatActivity(){
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val home = Home()
        val history = History()
        val event = Event()
        val information = Information()
        showFragment(home)

        binding.bottomNavigationView.run {
            setOnItemSelectedListener {
                when(it.itemId) {
                    R.id.ic_home -> showFragment(home)
                    R.id.ic_history -> showFragment(history)
                    R.id.ic_event -> showFragment(event)
                    R.id.ic_information -> showFragment(information)
                    else -> true
                }
            }
        }
    }
    private fun showFragment(fragment: Fragment): Boolean {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.container, fragment)
            commit()
        }
        return true
    }
}