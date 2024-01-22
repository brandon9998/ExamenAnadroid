package com.cursokotlin.mvvmexample.data.model

import com.google.gson.annotations.SerializedName

data class QuoteModel(
    @SerializedName("original_title") val original_title: String,
    @SerializedName("overiview") val overview: String,
    @SerializedName("poster_path") val poster_path: String,
    @SerializedName("realse_date") val realse_date: String,
    @SerializedName("voto_average") val voto_average: String
)