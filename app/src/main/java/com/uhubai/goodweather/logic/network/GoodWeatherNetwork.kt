package com.uhubai.goodweather.logic.network

import android.app.DownloadManager.Query
import retrofit2.await

object GoodWeatherNetwork {
    private val weatherService = ServiceCreator.create(WeatherService::class.java)
    private val placeService = ServiceCreator.create(PlaceService::class.java)

    suspend fun searchPlaces(query: String) = placeService.searchPlaces(query).await()

    suspend fun getDailyWeather(
        lng: String,
        lat: String
    ) = weatherService.getDailyWeather(lng, lat).await()

    suspend fun getRealtimeWeather(lng: String, lat: String) =
        weatherService.getRealtimeWeather(lng, lat).await()
}