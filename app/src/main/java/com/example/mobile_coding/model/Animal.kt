package com.example.mobile_coding.model

abstract class Animal (
    var name: String,
    private val age: Int,
    var breed: String,
    var color: String
) {
    abstract fun communicate(): String

    open fun getInfo() : String {
        return "$name, age: $age"
    }
    open fun getAdditionalInfo() : String {
        return "breed - $breed, color - $color"
    }
}
