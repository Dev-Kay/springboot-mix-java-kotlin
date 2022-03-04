package com.example.mixjavakotlin;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;

import com.example.mixjavakotlin.model.MemberDto;
import com.example.mixjavakotlin.model.PersonDto;
import com.example.mixjavakotlin.rest.MembersRestController;
import com.example.mixjavakotlin.rest.TestRestController;

@SpringBootTest(
    webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT
)
class MixKotlinApplicationTests {
    @Autowired
    TestRestTemplate testRestTemplate;

    @Test
    void get_member() {
        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(null);
        // ResponseEntity<MemberDto> response = testRestTemplate.getForEntity("/members", MemberDto.class);
        ResponseEntity<Object> response = testRestTemplate.getForEntity("/members", Object.class);

        MemberDto dto = (MemberDto)response.getBody();
    }

    @Test
    void get_member_address() {
        ResponseEntity<String> response = testRestTemplate.getForEntity("/members/addr", String.class);
        String dto = response.getBody();
    }

    @Test
    void get_test() {
        ResponseEntity<PersonDto> response = testRestTemplate.getForEntity("/test", PersonDto.class);
        PersonDto dto = response.getBody();
    }
}
