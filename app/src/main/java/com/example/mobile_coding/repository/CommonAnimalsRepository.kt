package com.example.mobile_coding.repository

import com.example.mobile_coding.api.RetrofitClient
import com.example.mobile_coding.api.models.Token
import com.example.mobile_coding.api.models.TokenRequest
import com.example.mobile_coding.model.Animal
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class CommonAnimalsRepository : AnimalsRepository {

    private val apiService = RetrofitClient.apiService

    override fun getAnimals(): List<Animal> {

        apiService.getAnimals(TOKEN_HEADER.format(token.token Type, token.accessToken))
    }

    private fun getToken() {
        val call: Call<Token> =
            apiService.getToken(TokenRequest(GRANT_TYPE, CLIENT_ID, CLIENT_SECRET))
        call.enqueue(object : Callback<Token> {
            override fun onResponse(
                call: Call<Token>,
                response: Response<Token>
            ) {
                val token = response.body()
            }

            override fun onFailure(
                call: Call<Token>?,
                t: Throwable?
            ) {
            }
        })
    }

    companion object {
        private const val GRANT_TYPE = "client_credentials"
        private const val CLIENT_ID = "xHWqTEuizkRsoOUJtjRaDUCYpL8gtMK2PWe88nRdosSLxvJKhF"
        private const val CLIENT_SECRET = "kcHS3I9ACry4DKmKBtQXQQESs3AHlXeUCFSMriP8"

        private const val TOKEN_HEADER = "%s %s"
    }
}