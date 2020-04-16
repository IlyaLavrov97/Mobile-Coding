package com.example.mobile_coding.model

// TODO Расширить модель по возможности
class Dog
constructor(
    name : String,
    age : Int,
    color: String,
    type: String
) : Animal(name, age, color, type) {
    override fun communicate(): String {
        return "GAV"
    }

    override fun getInfo(): String {
        return "Custom info about me, ${super.getInfo()}"
    }
}