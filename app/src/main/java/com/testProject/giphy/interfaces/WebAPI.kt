package com.testProject.giphy.interfaces

import com.testProject.giphy.Config
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.modals.ServerResponse
import retrofit2.Call
import retrofit2.http.*


interface WebAPI {


    @POST(Config.ServicesUrl + "randomid")
    fun getRandomId(@Body API_KEY: String?): Call<Giph?>?

    @GET(Config.ServicesUrl + "trending")
    fun getAllGiphs(
        @Query("api_key") api_key : String?,
        @Query("limit") limit: Int?,
        @Query("offset") offset: Int?,
        @Query("rating") rating: String?): Call<ServerResponse?>?

}

