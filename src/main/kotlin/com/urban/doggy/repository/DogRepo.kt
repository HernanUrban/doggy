package com.urban.doggy.repository

import com.urban.doggy.data.Dog
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface DogRepo : CrudRepository<Dog, String> {

    @Query("Select * From Dogs")
    fun findAllDogs(): List<Dog>

}