package com.example.mobile_coding.repository

import com.example.mobile_coding.api.AnimalMapper
import com.example.mobile_coding.api.RetrofitClient
import com.example.mobile_coding.api.models.AnimalsResponse
import com.example.mobile_coding.api.models.Token
import com.example.mobile_coding.api.models.TokenRequest
import com.example.mobile_coding.model.Animal
import retrofit2.Call


class CommonAnimalsRepository : AnimalsRepository {

    private val apiService = RetrofitClient.apiService

    override fun getAnimals(): List<Animal> {
        val token = getToken()
        val call: Call<AnimalsResponse> = apiService.getAnimals(TOKEN_HEADER.format(token?.tokenType, token?.accessToken), 100)
        return AnimalMapper.map(call.execute().body())
    }

    private fun getToken() : Token? {
        val call: Call<Token> =
            apiService.getToken(TokenRequest(GRANT_TYPE, CLIENT_ID, CLIENT_SECRET))
//        call.enqueue(object : Callback<Token> {
//            override fun onResponse(
//                call: Call<Token>,
//                response: Response<Token>
//            ) {
//                val token = response.body()
//            }
//
//            override fun onFailure(
//                call: Call<Token>?,
//                t: Throwable?
//            ) {
//            }
//        })
        return call.execute().body()
    }

    companion object {
        private const val GRANT_TYPE = "client_credentials"
        private const val CLIENT_ID = "xHWqTEuizkRsoOUJtjRaDUCYpL8gtMK2PWe88nRdosSLxvJKhF"
        private const val CLIENT_SECRET = "kcHS3I9ACry4DKmKBtQXQQESs3AHlXeUCFSMriP8"

        private const val TOKEN_HEADER = "%s %s"
    }
}