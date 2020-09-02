package com.testProject.giphy.BoundaryCallbacks

import android.util.Log
import androidx.paging.PagedList
import com.testProject.giphy.Dao.GiphDao
import com.testProject.giphy.viewModels.GetAllGiphsViewModel
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.helpers.Config
import com.testProject.giphy.helpers.MainServiceGenerator
import com.testProject.giphy.interfaces.WebAPI
import com.testProject.giphy.modals.ServerResponse
import com.testProject.giphy.repositories.GiphSearchRepositories
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class GiphBoundaryCallback (private val giphDao: GiphDao?,val getAllGiphsViewModel: GetAllGiphsViewModel) :

        PagedList.BoundaryCallback<Giph?>() {

        var offset = 0

        override fun onZeroItemsLoaded() {

            if (Config.serachString.equals("")|| Config.serachString == null) {

                val apiService = MainServiceGenerator.createService(WebAPI::class.java)
                val call = apiService.getAllGiphs(Config.API_KEY, 30, 0, "g")
                call?.enqueue(object : Callback<ServerResponse?> {
                    override fun onResponse(call: Call<ServerResponse?>, response: Response<ServerResponse?>) {
                        var serverResponse: ServerResponse? = response.body()
                        getAllGiphsViewModel.insertData(serverResponse?.data)
                    }
                    override fun onFailure(call: Call<ServerResponse?>, t: Throwable) {
                        Log.d("TAG", "onFailure: ")
                    }
                })
            } else {
                GiphSearchRepositories.serach(getAllGiphsViewModel, Config.serachString)
            }
        }

        override fun onItemAtFrontLoaded(itemAtFront: Giph) {
            //fetchUsers()
        }

        override fun onItemAtEndLoaded(itemAtEnd: Giph) {

            if (Config.serachString.equals("") || Config.serachString == null) {
                val api = MainServiceGenerator.createService(WebAPI::class.java)
                val call = api.getAllGiphs(Config.API_KEY, 30, offset, "g")
                call?.enqueue(object : Callback<ServerResponse?> {
                    override fun onResponse(
                        call: Call<ServerResponse?>,
                        response: Response<ServerResponse?>
                    ) {
                        var serverResponse: ServerResponse? = response.body()
                        getAllGiphsViewModel.insertData(serverResponse?.data)
                        offset = offset + 50
                    }

                    override fun onFailure(call: Call<ServerResponse?>, t: Throwable) {
                    }
                })
            }

        }
}