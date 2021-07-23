package com.urban.doggy.controller

import com.urban.doggy.data.Dog
import com.urban.doggy.service.DogService
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/dogs")
class DoggyController(val dogService: DogService) {

    @GetMapping
    fun getDogs(): List<Dog> = dogService.getDogs()

    @PostMapping
    fun newDog(@RequestBody dog: Dog) = dogService.createDog(dog)

    @GetMapping("/{id}")
    fun getDog(@PathVariable id: String) = dogService.getDog(id)
}