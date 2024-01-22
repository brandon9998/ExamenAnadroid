package com.cursokotlin.mvvmexample.data.database.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import com.cursokotlin.mvvmexample.domain.model.Quote
import com.google.gson.annotations.SerializedName

@Entity(tableName = "quote_table")
data class QuoteEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")val id: Int = 0,
    @ColumnInfo(name = "original_title") val original_title: String,
    @ColumnInfo(name = "overview") val overview: String,
    @ColumnInfo(name = "poster_path") val poster_path: String,
    @ColumnInfo(name = "realse_date") val realse_date: String,
    @ColumnInfo(name = "voto_average") val vote_average: String
)

fun Quote.toDatabase() = QuoteEntity(original_title = original_title, overview = overview, poster_path = poster_path,
    realse_date = realse_date, vote_average = voto_average)