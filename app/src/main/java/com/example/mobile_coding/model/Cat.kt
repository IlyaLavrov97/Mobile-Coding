package com.example.mobile_coding.model

class Cat
constructor(
    name: String,
    age: Int,
    breed: String,
    color: String) : Animal(name, age, breed, color
) {
    override fun communicate(): String {
        return "MEOW"
    }

    override fun getInfo(): String {
        return "${communicate()} I'm a cat ${super.getInfo()}"
    }

}