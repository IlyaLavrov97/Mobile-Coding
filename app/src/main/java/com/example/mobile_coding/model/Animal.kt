package com.example.mobile_coding.model

abstract class Animal (
    var name: String,
    var age: Int,
    private val color: String?,
    private val type: String?
) {
    abstract fun communicate(): String

    open fun getInfo() : String {
        return "$name, age: $age"
    }

    open fun getAdditionalInfo() : String {
        return "Additional info: color $color, breed: $type"
    }

    abstract fun getImage(): Int
}
