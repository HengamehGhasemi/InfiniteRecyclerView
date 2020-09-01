package com.testProject.giphy.helpers

import android.util.Log
import androidx.activity.viewModels
import androidx.paging.PagedList
import com.testProject.giphy.Config
import com.testProject.giphy.Dao.GiphDao
import com.testProject.giphy.MyViewModel
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.interfaces.WebAPI
import com.testProject.giphy.modals.ServerResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class GiphBoundaryCallback (private val giphDao: GiphDao?,val myViewModel: MyViewModel) :



        PagedList.BoundaryCallback<Giph?>() {

        var i = 0

        override fun onZeroItemsLoaded() {
            val apiService = MainServiceGenerator.createService(WebAPI::class.java)
            val call = apiService.getAllGiphs(Config.API_KEY,46,0,"g")
            call?.enqueue(object : Callback<ServerResponse?> {
                override fun onResponse(
                    call: Call<ServerResponse?>,
                    response: Response<ServerResponse?>
                ) {

                    var serverResponse: ServerResponse? = response.body()
                    myViewModel.insertData(serverResponse?.data)

                }

                override fun onFailure(call: Call<ServerResponse?>, t: Throwable) {
                    Log.d("TAG", "onFailure: ")
                }
            })
        }

        override fun onItemAtFrontLoaded(itemAtFront: Giph) {
            //fetchUsers()
        }

        override fun onItemAtEndLoaded(itemAtEnd: Giph) {

            val api = MainServiceGenerator.createService(WebAPI::class.java)
            val call = api.getAllGiphs(Config.API_KEY,46,i,"g")
            call?.enqueue(object : Callback<ServerResponse?> {
                override fun onResponse(call: Call<ServerResponse?>, response: Response<ServerResponse?>) {
                   var serverResponse : ServerResponse? = response.body()
                    myViewModel.insertData(serverResponse?.data)
                    i= i+46
                }

                override fun onFailure(call: Call<ServerResponse?>, t: Throwable) {
                }
            })

        }
}