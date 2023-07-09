package com.uhubai.goodweather.logic.dao

import com.uhubai.goodweather.GoodWeatherApplication
import com.uhubai.goodweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface PlaceService {
    @GET("v2/place?token=${GoodWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}