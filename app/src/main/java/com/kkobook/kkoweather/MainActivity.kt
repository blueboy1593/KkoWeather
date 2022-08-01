package com.kkobook.kkoweather

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kkobook.kkoweather.databinding.ActivityMainBinding
import com.kkobook.kkoweather.ui.main.WeatherFragment

class MainActivity : AppCompatActivity() {
    private lateinit var weatherFragment: WeatherFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityBinding.root)
        if (savedInstanceState == null) {
            weatherFragment = WeatherFragment.newInstance()
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, weatherFragment)
                .commitNow()
        }
    }
}