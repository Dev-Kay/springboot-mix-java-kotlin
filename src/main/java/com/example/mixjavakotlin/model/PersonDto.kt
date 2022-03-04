package com.example.mixjavakotlin.model

import org.springframework.boot.context.properties.ConstructorBinding

@ConstructorBinding
data class PersonDto(
    val name: String,
    val detail: Detail
) {
    data class Detail (
        val age: Int,
        val add: String
    )
}
