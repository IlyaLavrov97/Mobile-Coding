package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot

class FakeAnimalsRepository : AnimalsRepository {
    override fun getAnimals(): List<Animal> {
        return ArrayList<Animal>().apply {
            add(Cat("1", 9, "(A)", "(AA)"))
            add(Parrot("2", 5, "A", "AA"))
            add(Dog("3", 13, "B", "BB"))
            add(Cat("4", 3, "C", "CC"))
            add(Parrot("5", 8, "D", "DD"))
            add(Dog("6", 7, "E", "EE"))
            add(Cat("7", 5,"F", "FF"))
            add(Parrot("8", 3,"G", "GG"))
            add(Dog("9", 4,"H", "HH"))
            add(Cat("10", 9,"J", "JJ"))
            add(Parrot("11", 5, "I", "II"))
            add(Dog("12", 13,"K","KKK"))
            add(Cat("13", 3,"M","MM"))
            add(Parrot("14", 8,"l","LL"))
            add(Dog("15", 7,"P","PP"))
            add(Cat("16", 5,"O","OO"))
            add(Parrot("17", 3,"P","PP"))
            add(Dog("18", 4,"S","SS"))
            add(Cat("19", 9,"W","WW"))
            add(Parrot("20", 5,"B","BB"))
            add(Dog("21", 13,"V","VV"))
            add(Cat("22", 3,"Z","ZZ"))
            add(Parrot("23", 8,"X","XX"))
            add(Dog("24", 7,"XXX","XXXXX"))
            add(Cat("25", 5,"<>","<<>>"))
            add(Parrot("26", 3,"White","Extra white"))
            add(Dog("27", 4,"Shrek","Kek"))
        }
    }
}