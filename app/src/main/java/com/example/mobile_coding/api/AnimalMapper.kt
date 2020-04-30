package com.example.mobile_coding.api

import com.example.mobile_coding.api.models.AnimalsResponse
import com.example.mobile_coding.model.Animal
import com.example.mobile_coding.model.Cat
import com.example.mobile_coding.model.Dog
import com.example.mobile_coding.model.Parrot

object AnimalMapper {
    fun map(response: AnimalsResponse?): List<Animal> {
        return response?.animals?.map { apiAnimal ->
            when (apiAnimal.type) {
                "Cat" -> Cat(
                    apiAnimal.name,
                    apiAnimal.age,
                    apiAnimal.photos.getOrNull(0)?.medium,
                    apiAnimal.colors.primary,
                    apiAnimal.breeds.primary
                )
                "Dog" -> Dog(
                    apiAnimal.name,
                    apiAnimal.age,
                    apiAnimal.photos.getOrNull(0)?.medium,
                    apiAnimal.colors.primary,
                    apiAnimal.breeds.primary
                )
                else -> Parrot(
                    apiAnimal.name,
                    apiAnimal.age,
                    apiAnimal.photos.getOrNull(0)?.medium,
                    apiAnimal.colors.primary,
                    apiAnimal.breeds.primary,
                    25
                )
            }
        } ?: emptyList()
    }
}