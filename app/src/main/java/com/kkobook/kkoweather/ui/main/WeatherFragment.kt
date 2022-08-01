package com.kkobook.kkoweather.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.kkobook.kkoweather.databinding.FragmentMainBinding

class WeatherFragment : Fragment() {
    private lateinit var fragmentMainBinding: FragmentMainBinding

    companion object {
        fun newInstance() = WeatherFragment()
    }

    private lateinit var viewModel: WeatherViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        fragmentMainBinding = FragmentMainBinding.inflate(inflater)
        fragmentMainBinding.refresh.setOnClickListener {
            // load API
        }

        return fragmentMainBinding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this)[WeatherViewModel::class.java]
    }

}