package com.testProject.giphy

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope


import androidx.paging.DataSource
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.testProject.giphy.Dao.GiphDao
import com.testProject.giphy.Db.GiphDb
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.helpers.GiphBoundaryCallback
import io.reactivex.disposables.Disposable
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import okhttp3.Dispatcher

public class MyViewModel(application: Application) : AndroidViewModel(application){

    var  giphDao: GiphDao? = null
    var callback: GiphBoundaryCallback? ? = null
    var factory: DataSource.Factory<Int, Giph> ? = null
    var config : PagedList.Config ? = null
    var giphyes: LiveData<PagedList<Giph>> ? = null

    init {
         giphDao = GiphDb.get(application).gapeDado()
         callback = GiphBoundaryCallback(giphDao,this)
         factory  = giphDao?.AllGiphs()
         config = PagedList.Config.Builder()
             .setPageSize(60)
            .setInitialLoadSizeHint(60)
            .setEnablePlaceholders(true)
            .build()
        giphyes =
            LivePagedListBuilder(factory!!, config!!).setBoundaryCallback(callback!!).build()
    }

    fun insertData(giphs : List<Giph>?)  {
        viewModelScope.launch(Dispatchers.IO){
            giphDao?.insertAll(giphs!!)
        }
    }
}