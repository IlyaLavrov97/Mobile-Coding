package com.example.mobile_coding.model

// TODO Расширить модель по возможности
class Cat
constructor(
    name: String,
    age: Int,
    color: String,
    type: String
) : Animal(name, age, color, type
) {
    override fun communicate(): String {
        return "MEOW"
    }

    override fun getInfo(): String {
        return "I'm a cat ${super.getInfo()}"
    }
}