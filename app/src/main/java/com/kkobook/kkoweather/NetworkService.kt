package com.kkobook.kkoweather


import com.google.gson.GsonBuilder
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

class RetrofitServiceProvider {
    fun apiService(): RetrofitService =
        Retrofit.Builder()
            .baseUrl("https://newsapi.org")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RetrofitService::class.java)
}

interface NetworkService {
    @GET("v1/search/news.json")
    fun getSearchNews(
        @Query("query") query: String,
        @Query("display") display: Int? = null,
        @Query("start") start: Int? = null
    ): Call<WeatherInfo>

    companion object {
        const val API_KEY = "9781b8438fd44e4aa2be4ac5f419014c"
    }
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