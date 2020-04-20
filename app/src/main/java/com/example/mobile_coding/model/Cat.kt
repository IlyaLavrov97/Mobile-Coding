package com.example.mobile_coding.model

import com.example.mobile_coding.R

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
        return "${communicate()} I'm a cat ${super.getInfo()}"
    }

    override fun getImage(): Int {
        return R.drawable.cat
    }
}