package com.example.mobile_coding.model

class Dog
constructor(
    name : String,
    age : Int,
    breed: String,
    color: String
) : Animal(name, age, breed, color) {
    override fun communicate(): String {
        return "GAV"
    }

    override fun getInfo(): String {
        return "Custom info about ME ${communicate()}, ${super.getInfo()}"
    }

    override fun getAdditionalInfo() :String{
        return "my ${super.getAdditionalInfo()}"
    }
}