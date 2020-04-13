package com.example.mobile_coding.repository

import com.example.mobile_coding.model.*

class FakeAnimalsRepository : AnimalsRepository {
    override fun getAnimals(): List<Animal> {
        return ArrayList<Animal>().apply {

            add(Cat("1", 9))
            add(Parrot("2", 5))
            add(Dog("3", 13))
            add(Cat("4", 3))
            add(Parrot("5", 8))
            add(Dog("6", 7))
            add(Cat("7", 5))
            add(Parrot("8", 3))
            add(Dog("9", 4))
            add(Cat("10", 9))
            add(Parrot("11", 5))
            add(Dog("12", 13))
            add(Cat("13", 3))
            add(Parrot("14", 8))
            add(Dog("15", 7))
            add(Cat("16", 5))
            add(Parrot("17", 3))
            add(Dog("18", 4))
            add(Cat("19", 9))
            add(Parrot("20", 5))
            add(Dog("21", 13))
            add(Cat("22", 3))
            add(Parrot("23", 8))
            add(Dog("24", 7))
            add(Cat("25", 5))
            add(Parrot("26", 3))
            add(Dog("27", 4))
        }
    }
}