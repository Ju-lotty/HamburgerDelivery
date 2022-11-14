package com.project.hamburgerdelivery.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.hamburgerdelivery.R
import com.project.hamburgerdelivery.databinding.FragmentHomeBinding

class Home : Fragment() {
    private lateinit var binding: FragmentHomeBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewFlipper()
        deliveryButton()
        forHereButton()
        alarmButton()
        menuButton()
        locationButton()
    }

    private fun alarmButton() = with(binding) {
        val alarm = Alarm()
        alarmButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, alarm).commit()
        }
    }

    private fun viewFlipper() = with(binding) {
        viewFlipper.startFlipping()
        viewFlipper.flipInterval = 4000
        viewFlipper.setInAnimation(activity?.applicationContext, android.R.anim.fade_in)
        viewFlipper.setOutAnimation(activity?.applicationContext, android.R.anim.fade_out)
    }

    private fun deliveryButton() = with(binding) {
        val delivery = Delivery()
        deliveryButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, delivery).commit()
        }
    }

    private fun forHereButton() = with(binding) {
        val storeEat = StoreEat()
        forHereButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, storeEat).commit()
        }
    }

    private fun menuButton() = with(binding){
        val menu = Menu()
        menuButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, menu).commit()
        }
    }

    private fun locationButton() = with(binding){
        val location = Location()
        locationButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, location).commit()
        }
    }
}