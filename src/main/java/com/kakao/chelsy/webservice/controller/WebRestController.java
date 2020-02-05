package com.kakao.chelsy.webservice.controller;

import com.kakao.chelsy.webservice.domain.PostsRepository;
import com.kakao.chelsy.webservice.domain.PostsSaveRequestDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor // 얘가 postsRepository를 주입해줌
public class WebRestController {

    private PostsRepository postsRepository;

    @GetMapping("/")
    public String hello(){
        return "hello";
    }

    @PostMapping("/posts")
    public void savePosts(@RequestBody PostsSaveRequestDto dto) {
        postsRepository.save(dto.toEntity());
    }
}