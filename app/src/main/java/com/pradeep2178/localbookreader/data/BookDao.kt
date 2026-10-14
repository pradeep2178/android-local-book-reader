package com.pradeep2178.localbookreader.data

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "books")
data class BookEntity(
    @PrimaryKey(autoGenerate = true)
    val id: Long = 0,
    val title: String,
    val fileUri: String,
    val pageCount: Int = 0,
    val indexed: Boolean = false,
    val addedAt: Long = System.currentTimeMillis(),
)
