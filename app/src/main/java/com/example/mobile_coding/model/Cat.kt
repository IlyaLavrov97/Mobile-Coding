package com.example.mobile_coding.model

// TODO Расширить модель по возможности
class Cat
constructor(
    name: String,
    age: Int) : Animal(name, age
) {
    override fun communicate(): String {
        return "MEOW"
    }

    override fun getInfo(): String {
        return "${communicate()} I'm a cat ${super.getInfo()}"
    }
}