package com.example.mixjavakotlin.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
public class MemberDto {
    String name;
    String phone;
    String address;
    String job;

    @Builder
    public MemberDto(String name, String phone, String address, String job) {
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.job = job;
    }
}
