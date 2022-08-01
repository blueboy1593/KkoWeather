package com.kkobook.kkoweather

import com.google.gson.annotations.SerializedName

data class WeatherInfo(
    @SerializedName("id")
    val id: String? = null,
)
