package com.example.mobile_coding.model

// TODO Расширить модель по возможности
class Parrot
constructor(
    name: String,
    age: Int
) : Animal(name, age), Flyable {
    override fun fly() {
        // fly
    }

    override fun getInfo(): String {
        return "I'm Parrot. There is info about me: ${super.getInfo()}"
    }

    override fun communicate(): String {
        return "I AM A PARRROT!"
    }
}