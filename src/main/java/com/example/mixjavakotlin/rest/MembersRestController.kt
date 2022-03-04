package com.example.mixjavakotlin.rest

import com.example.mixjavakotlin.model.MemberDto
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/members")
class MembersRestController {
    @GetMapping
    fun getMember() : MemberDto {
        var memberDto = MemberDto("이름", "010-1234-5678", "서울", "IT")
        return memberDto
    }

    @GetMapping("/addr")
    fun getMemberAddr() : String = MemberDto("이름", "010-1234-5678", "서울", "IT").address
}