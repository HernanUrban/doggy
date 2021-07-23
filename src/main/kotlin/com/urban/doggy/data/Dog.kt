package com.urban.doggy.data

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table("DOGS")
data class Dog(@Id val id: String?, val name: String, val breed: String)
