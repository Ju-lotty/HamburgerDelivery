package com.project.hamburgerdelivery.view.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.project.hamburgerdelivery.R
import com.project.hamburgerdelivery.databinding.FragmentAlarmBinding

class Alarm : Fragment() {
    private lateinit var binding: FragmentAlarmBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentAlarmBinding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        backButtoninit()
    }

    private fun backButtoninit() = with(binding) {
        val home = Home()
        backButton.setOnClickListener {
            requireActivity().supportFragmentManager.beginTransaction().replace(R.id.container, home).commit()
        }
    }
}