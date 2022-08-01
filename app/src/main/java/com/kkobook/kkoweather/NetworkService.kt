package com.kkobook.kkoweather


import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface NetworkService {
    @GET("v1/search/news.json")
    fun getSearchNews(
        @Query("query") query: String,
        @Query("display") display: Int? = null,
        @Query("start") start: Int? = null
    ): Call<WeatherInfo>
}

//interface NetworkService {
//    @GET("/info")
//    fun getWeather() : Call<WeatherInfo>
//
//    companion object {
//        private const val BASE_URL = "www.naver.com"
//
//        private val gson = GsonBuilder()
//            .setLenient()
//            .create()
//
//        fun create() :
//    }
//}