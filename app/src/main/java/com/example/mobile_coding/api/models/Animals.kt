package com.example.mobile_coding.api.models

import com.google.gson.annotations.SerializedName

data class Animals
constructor(
    @SerializedName("animals") val animals: List<Animal>,
    @SerializedName("pagination") val pagination: Pagination
)