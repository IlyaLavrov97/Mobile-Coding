package com.example.mobile_coding.model

import com.example.mobile_coding.R

class Dog
constructor(
    name : String,
    age : Int,
    color: String,
    type: String
) : Animal(name, age, color, type) {
    override fun communicate(): String {
        return "GAV"
    }

    override fun getInfo(): String {
        return "Custom info about ME ${communicate()}, ${super.getInfo()}"
    }

    override fun getImage(): Int {
        return R.drawable.dog
    }
}