package com.example.mobile_coding.api

import com.example.mobile_coding.api.models.Animals
import com.example.mobile_coding.api.models.Token
import com.example.mobile_coding.api.models.TokenRequest
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface ApiService {
    @POST("/v2/oauth2/token")
    fun getToken(@Body request: TokenRequest): Call<Token>

    @GET("/v2/animals")
    fun getAnimals(@Header("Authorization") token: String): Call<Animals>
}