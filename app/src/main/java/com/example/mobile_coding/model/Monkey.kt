package com.example.mobile_coding.model

class Monkey
constructor(name: String, age: Int) : Animal(name, age)
{
    override fun communicate(): String {
        return "Ua ua ua"
    }

    override fun getInfo(): String {
        return "I am monkey ${super.getInfo()}, ${communicate()}"
    }
}