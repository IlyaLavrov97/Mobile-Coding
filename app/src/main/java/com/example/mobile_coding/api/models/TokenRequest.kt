package com.example.mobile_coding.api.models

data class TokenRequest
constructor(
    val grant_type: String,
    val client_id: String,
    val client_secret: String
)