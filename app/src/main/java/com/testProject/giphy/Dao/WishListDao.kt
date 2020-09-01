package com.testProject.giphy.Dao

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.testProject.giphy.entity.WishGiph


@Dao
interface WishListDao {

    @Query("SELECT * FROM  wish")
    fun GetAllGiphs() : DataSource.Factory<Int, WishGiph>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertAll(posts: List<WishGiph>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(wishGiph: WishGiph)

    @Query("DELETE FROM wish WHERE id = :Id")
    fun deleteById(Id: String)

    @Query("DELETE FROM wish")
    fun deleteAll()

}