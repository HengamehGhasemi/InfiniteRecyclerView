package com.testProject.giphy.repositories

import com.testProject.giphy.helpers.Config
import com.testProject.giphy.viewModels.GetAllGiphsViewModel
import com.testProject.giphy.helpers.MainServiceGenerator
import com.testProject.giphy.interfaces.WebAPI
import com.testProject.giphy.modals.ServerResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object GiphSearchRepositories {
        //Create Retrofit service to hit apis
   private val apiService = MainServiceGenerator.createService(WebAPI::class.java)
   var i= 0
        // Create function here to login
   fun serach(getAllGiphsViewModel : GetAllGiphsViewModel, serachString:String?) {
       val call = apiService.serach(Config.API_KEY,24,i,"g",serachString,"eng")
        call?.enqueue(object : Callback<ServerResponse?> {
            override fun onResponse(call: Call<ServerResponse?>, response: Response<ServerResponse?>) {
                    var serverResponse : ServerResponse? = response.body()
                    getAllGiphsViewModel.DeletAllData()
                    getAllGiphsViewModel.insertData(serverResponse?.data)
                    i= i+30
                }
                override fun onFailure(call: Call<ServerResponse?>, t: Throwable) {
            }
        })
   }
}
