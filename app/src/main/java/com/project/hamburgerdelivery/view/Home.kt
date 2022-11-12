package com.project.hamburgerdelivery.view

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
    ): View? {
        binding = FragmentHomeBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewFlipper()
    }
    private fun viewFlipper() = with(binding) {
        viewFlipper.startFlipping()
        viewFlipper.flipInterval = 5000
        viewFlipper.setInAnimation(activity?.applicationContext, android.R.anim.fade_in)
        viewFlipper.setOutAnimation(activity?.applicationContext, android.R.anim.fade_out)
    }
}