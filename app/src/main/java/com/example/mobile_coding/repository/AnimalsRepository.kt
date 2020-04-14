package com.example.mobile_coding.repository

import com.example.mobile_coding.model.Animal

interface AnimalsRepository {
    fun getAnimals() : List<Animal>
}