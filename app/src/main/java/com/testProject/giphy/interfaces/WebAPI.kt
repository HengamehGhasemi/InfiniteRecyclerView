package com.testProject.giphy.interfaces

import com.testProject.giphy.helpers.Config
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.modals.ServerResponse
import retrofit2.Call
import retrofit2.http.*


interface WebAPI {

    @GET(Config.ServicesUrl + "trending")
    fun getAllGiphs(
        @Query("api_key") api_key : String?,
        @Query("limit") limit: Int?,
        @Query("offset") offset: Int?,
        @Query("rating") rating: String?): Call<ServerResponse?>?

    @GET(Config.ServicesUrl + "search")
    fun serach(
        @Query("api_key") api_key : String?,
        @Query("limit") limit: Int?,
        @Query("offset") offset: Int?,
        @Query("rating") rating: String?,
        @Query("q") q: String?,
        @Query("lang") lang: String?
    ): Call<ServerResponse?>?

}

