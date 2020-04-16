package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot
import kotlin.random.Random

class FakeAnimalsRepository : AnimalsRepository {
    override fun getAnimals(): List<Animal> {
        return ArrayList<Animal>().apply {
            for (i in 0..20) {
                when (i % 3) {
                    0 -> add(
                        Cat(
                            "Cat${Random.nextInt(1, 7)}", Random.nextInt(1, 10),
                            "${Random.nextInt(1, 3)}CatBreed", "${Random.nextInt(1, 3)}"
                        )
                    )
                    1 -> add(
                        Dog(
                            "Dog${Random.nextInt(10, 20)}", Random.nextInt(1, 15),
                            "${Random.nextInt(1, 3)}DogBreed", "${Random.nextInt(1, 3)}"
                        )
                    )
                    2 -> add(
                        Parrot(
                            "Parrot${Random.nextInt(3, 10)}", Random.nextInt(1, 5),
                            "${Random.nextInt(1, 3)}ParrotBreed", "${Random.nextInt(1, 3)}"
                        )
                    )
                }
            }
        }
    }
}