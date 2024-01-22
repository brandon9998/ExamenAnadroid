package com.cursokotlin.mvvmexample.domain.model

import com.cursokotlin.mvvmexample.data.database.entities.QuoteEntity
import com.cursokotlin.mvvmexample.data.model.QuoteModel

data class Quote (val original_title:String, val overview:String, val poster_path:String,
                  val realse_date:String, val voto_average:String)

fun QuoteModel.toDomain() = Quote(original_title, overview, poster_path, realse_date, voto_average)
fun QuoteEntity.toDomain() = Quote(original_title, overview, poster_path, realse_date, vote_average)
