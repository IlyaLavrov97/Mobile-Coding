package com.example.mobile_coding.model

abstract class Animal (
    var name: String,
    private val age: Int,
    var breed: String = "Unknown",
    var color: String = "Unknown"
) {
    abstract fun communicate(): String

    open fun getInfo() : String {
        return "$name, age: $age. "
    }
    open fun getAddInfo(): String {
        return "\nThis is $breed and $color color "
    }

}
