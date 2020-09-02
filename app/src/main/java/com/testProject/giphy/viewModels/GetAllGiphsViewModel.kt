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
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

public class GetAllGiphsViewModel(application: Application) : AndroidViewModel(application){

    var  giphDao: GiphDao? = null
    var callback: GiphBoundaryCallback? ? = null
    var factory: DataSource.Factory<Int, Giph> ? = null
    var config : PagedList.Config ? = null
    var giphyes: LiveData<PagedList<Giph>> ? = null

    init {
         giphDao = GiphDb.get(application).gapeDado()
         callback = GiphBoundaryCallback(giphDao,this)
         factory  = giphDao?.GetAllGiphs()
         config = PagedList.Config.Builder()
             .setPageSize(60)
            .setInitialLoadSizeHint(60)
            .setEnablePlaceholders(true)
            .build()
        giphyes = LivePagedListBuilder(factory!!, config!!).setBoundaryCallback(callback!!).build()

    }

    fun insertData(giphs : List<Giph>?)  {
        if (giphs != null) {
            viewModelScope.launch(Dispatchers.Default) {
                giphDao?.insertAll(giphs)
            }
        }
    }

    fun insertAData(giphs : Giph?)  {
        viewModelScope.launch(Dispatchers.Default){
            giphDao?.insert(giphs)
        }
    }

    fun DeletAllData()  {
        viewModelScope.launch(Dispatchers.Default){ giphDao?.deleteAll()
        }
    }

}