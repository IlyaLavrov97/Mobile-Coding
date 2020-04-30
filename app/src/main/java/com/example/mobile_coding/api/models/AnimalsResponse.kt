package com.example.mobile_coding.api.models

data class AnimalsResponse(
    val animals: List<Animal>,
    val pagination: Pagination
)