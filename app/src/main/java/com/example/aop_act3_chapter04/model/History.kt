package com.example.aop_act3_chapter04.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class History (
    @PrimaryKey val uid: Int?,
    @ColumnInfo(name = "keyword") val keyword: String?
)