package com.example.mobile_coding.model

import com.example.mobile_coding.R

class Parrot
constructor(
    name: String,
    age: Int,
    color: String,
    type: String,
    private val wingSize: Int
) : Animal(name, age, color, type), Flyable {
    override fun fly() {
        // fly
    }

    override fun getInfo(): String {
        return "I'm Parrot. There is info about me: ${super.getInfo()}"
    }

    override fun communicate(): String {
        return "I AM A PARRROT!"
    }

    fun getWingDescription(): String {
        return "My super wing is $wingSize size"
    }

    override fun getImage(): Int {
        return R.drawable.parrot
    }
}