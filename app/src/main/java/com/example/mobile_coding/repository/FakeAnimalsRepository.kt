package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot
import kotlin.collections.ArrayList
import kotlin.random.Random

class FakeAnimalsRepository : AnimalsRepository {
    override fun getAnimals(): List<Animal> {
        return ArrayList<Animal>().apply {
            for (i in 0 until 20) {
                when {
                    i % 3 == 0 -> {
                        add(
                            Cat(
                                "Cat" + Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100),
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString()
                            )
                        )
                    }
                    i % 3 == 1 -> {
                        add(
                            Dog(
                                "Dog" + Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100),
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString()
                            )
                        )
                    }
                    i % 3 == 2 -> {
                        add(
                            Parrot(
                                "Parrot" + Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100),
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100).toString(),
                                Random.nextInt(i, i + 100)
                            )
                        )
                    }
                }
            }
        }
    }
}