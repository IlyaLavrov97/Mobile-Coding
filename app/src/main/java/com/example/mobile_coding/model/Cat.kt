package com.example.mobile_coding.model

class Cat
constructor(
    name: String,
    age: Int,
    imageUrl: String?,
    color: String,
    type: String
) : Animal(name, age, imageUrl, color, type) {
    override fun communicate(): String {
        return "MEOW"
    }

    override fun getInfo(): String {
        return "${communicate()} I'm a cat ${super.getInfo()}"
    }

    override fun getImage(): String? {
        return imageUrl
    }
}