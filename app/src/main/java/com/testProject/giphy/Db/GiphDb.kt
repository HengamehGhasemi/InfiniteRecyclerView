package com.testProject.giphy.Db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.testProject.giphy.Dao.GiphDao
import com.testProject.giphy.Dao.WishListDao
import com.testProject.giphy.entity.Giph
import com.testProject.giphy.entity.WishGiph


@Database(
    entities = [Giph::class, WishGiph::class],
    version = 2,
    exportSchema = false
)
abstract class GiphDb : RoomDatabase() {

    abstract fun wishDado() : WishListDao
    abstract fun gapeDado() : GiphDao


    companion object {
        private var instance: GiphDb? = null
        @Synchronized
        fun get(context: Context): GiphDb {
            if (instance == null) {
                instance = Room.databaseBuilder(
                    context.applicationContext,
                    GiphDb::class.java,
                    "giph_db"
                )
                .build()
            }
            return instance!!
        }
    }
}