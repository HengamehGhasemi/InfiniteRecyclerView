package com.testProject.giphy.helpers

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object MainServiceGenerator {

    private val BASE_URL = "http://api.giphy.com/v1/gifs/"

    private val builder = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = builder.build()

    private val httpClient = OkHttpClient.Builder()

    fun <S> createService(serviceClass: Class<S>?): S {
        return retrofit.create(serviceClass)
    }
}
