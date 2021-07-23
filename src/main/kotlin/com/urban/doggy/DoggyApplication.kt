package com.urban.doggy

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DoggyApplication

fun main(args: Array<String>) {
	runApplication<DoggyApplication>(*args)
}
