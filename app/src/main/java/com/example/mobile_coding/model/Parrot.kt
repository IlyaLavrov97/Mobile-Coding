package com.example.mobile_coding.model

class Parrot
constructor(
    name: String,
    age: String,
    imageUrl: String?,
    color: String?,
    type: String?,
    private val wingSize: Int
) : Animal(name, age, imageUrl, color, type), Flyable {
    override fun fly() {
        // fly
    }

    override fun getInfo(): String {
        return "I'm Parrot. ${super.getInfo()}"
    }

    override fun communicate(): String {
        return "I AM A PARRROT!"
    }

    fun getWingDescription(): String {
        return "My super wing is $wingSize size"
    }
}