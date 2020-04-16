package com.example.mobile_coding.model

class Parrot
constructor(
    name: String,
    age: Int,
    breed: String,
    color: String
) : Animal(name, age, breed, color), Flyable {
    override fun fly() {
        // TODO fly implementation
    }

    override fun getAdditionalInfo(): String {
        return "you did know that my ${super.getAdditionalInfo()} "
    }

    override fun getInfo(): String {
        return "I'm Parrot. There is info about me: ${super.getInfo()}"
    }

    override fun communicate(): String {
        return "I AM A PARRROT!"
    }
}