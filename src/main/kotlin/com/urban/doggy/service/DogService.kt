package com.urban.doggy.service

import com.urban.doggy.data.Dog
import com.urban.doggy.repository.DogRepo
import org.springframework.stereotype.Service

@Service
class DogService(val dogRepo: DogRepo) {

    fun getDogs(): List<Dog> = dogRepo.findAllDogs()

    fun createDog(dog: Dog) = dogRepo.save(dog)

    fun getDog(id: String) = dogRepo.findById(id)
}