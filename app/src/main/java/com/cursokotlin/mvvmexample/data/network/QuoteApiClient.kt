package com.cursokotlin.mvvmexample.data.network

import com.cursokotlin.mvvmexample.data.model.QuoteModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface QuoteApiClient {
    @GET("popular")
    suspend fun getAllQuotes(): Response<List<QuoteModel>>
}