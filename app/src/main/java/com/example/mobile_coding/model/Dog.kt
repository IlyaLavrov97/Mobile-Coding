package com.example.mobile_coding.model

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
        return "I'm DOGGY. ${communicate()}. ${super.getInfo()}"
    }
}