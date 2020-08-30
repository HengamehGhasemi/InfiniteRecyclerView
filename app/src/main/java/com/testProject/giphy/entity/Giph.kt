package com.testProject.giphy.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "giph_table")
class Giph(
    var type: String? = "gif",
    var url: String?,
    @PrimaryKey var id: String?)