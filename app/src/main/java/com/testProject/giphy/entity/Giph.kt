package com.testProject.giphy.entity

import androidx.annotation.NonNull
import androidx.room.Entity
import androidx.room.Ignore
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName
import com.testProject.giphy.modals.Images
import org.jetbrains.annotations.NotNull

@Entity(tableName = "giph_table")
class Giph(

    @SerializedName("type")
    var type: String? = "gif",
    @SerializedName("url")
    var url: String?,
    @SerializedName("embed_url")
    var embed_url: String?,
    @SerializedName("title")
    var title: String?,
    @NonNull
    @PrimaryKey
    @SerializedName("id")
    var id: String,
)