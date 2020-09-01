package com.testProject.giphy.helpers

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object MainServiceGenerator {

    private val builder = Retrofit.Builder()
        .baseUrl(Config.ServicesUrl)
        .addConverterFactory(GsonConverterFactory.create())

    private val retrofit = builder.build()

    fun <S> createService(serviceClass: Class<S>?): S {
        return retrofit.create(serviceClass)
    }
}
