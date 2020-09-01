package com.testProject.giphy.entity

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "wish")
class WishGiph(
    @NonNull
    @PrimaryKey
    val id: String,
    val type: String,
    val url: String,
    val embed_url: String,
    val title: String,
)