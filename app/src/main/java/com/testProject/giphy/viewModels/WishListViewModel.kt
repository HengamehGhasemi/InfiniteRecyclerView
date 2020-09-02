package com.testProject.giphy.viewModels

import android.app.Application
import androidx.lifecycle.*


import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.testProject.giphy.Dao.GiphDao
import com.testProject.giphy.Db.GiphDb
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.BoundaryCallbacks.GiphBoundaryCallback
import com.testProject.giphy.Dao.WishListDao
import com.testProject.giphy.WishList
import com.testProject.giphy.entity.WishGiph
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

public class WishListViewModel(application: Application) : AndroidViewModel(application){

    var  wishListDao: WishListDao? = null
    var factory: DataSource.Factory<Int, WishGiph> ? = null
    var config : PagedList.Config ? = null
    var wishList: LiveData<PagedList<WishGiph>> ? = null

    init {
         wishListDao = GiphDb.get(application).wishDado()
         factory  = wishListDao?.GetAllGiphs()
         config = PagedList.Config.Builder()
             .setPageSize(60)
            .setInitialLoadSizeHint(60)
            .setEnablePlaceholders(true)
            .build()
        wishList = LivePagedListBuilder(factory!!, config!!).build()

    }

    fun insertData(wishGips : List<WishGiph>?)  {
        viewModelScope.launch(Dispatchers.IO){
            wishListDao?.insertAll(wishGips!!)
        }
    }

    fun insertAData(giphs : WishGiph?)  {
        if (giphs != null) {
            viewModelScope.launch(Dispatchers.Default) {
                wishListDao?.insert(giphs)
            }
        }
    }

    fun DeletData()  {
        viewModelScope.launch(Dispatchers.Default){ wishListDao?.deleteAll()
        }
    }

    fun DeletAData(giph : WishGiph?)  {
        viewModelScope.launch(Dispatchers.Default){ wishListDao?.deleteById(giph?.id!!)
        }
    }
}