package com.testProject.giphy.Dao

import android.content.ClipData.Item
import androidx.paging.DataSource
import androidx.paging.PagedList
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.testProject.giphy.entity.Giph


@Dao
interface GiphDao {

    @Query("SELECT * FROM  giph_table")
    fun GetAllGiphs() : DataSource.Factory<Int, Giph>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(posts: List<Giph>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(giph: Giph?)

    @Query("DELETE  FROM giph_table")
    fun deleteAll()

}