package com.example.mixjavakotlin.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.mixjavakotlin.model.PersonDto;

@RestController
@RequestMapping("/test")
public class TestRestController {
    @GetMapping
    public PersonDto getTest() {
        PersonDto personDto = new PersonDto("홍길동", new PersonDto.Detail(30, "서울"));

        return personDto;
    }
}
