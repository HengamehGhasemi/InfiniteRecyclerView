package com.testProject.giphy.interfaces

import retrofit2.Call
import retrofit2.http.*


interface WebAPI {

    @GET("http://api.giphy.com/v1/gifs/")
    fun getAllGiphs(
        @Header("authorization") token: String?
    ): Call<WalletGetCustomersResponse?>?
}
