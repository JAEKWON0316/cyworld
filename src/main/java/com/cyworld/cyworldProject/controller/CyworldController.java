package com.cyworld.cyworldProject.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cyworld.cyworldProject.dto.DiaryDto;
import com.cyworld.cyworldProject.entity.DiaryEntity;
import com.cyworld.cyworldProject.entity.UserEntity;
import com.cyworld.cyworldProject.repository.DiaryRepository;
import com.cyworld.cyworldProject.repository.UserRepository;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;


@RestController
@RequestMapping("/cyworld")
public class CyworldController {
     @Autowired
    private UserRepository userRepository;

    @Autowired
    private DiaryRepository diaryRepository;

    @GetMapping("/users")
    public List<UserEntity> getUsers() {
        return userRepository.findAll();
    }
    
    @GetMapping("/guest")
    public List<DiaryEntity> getDiaries() {
        return diaryRepository.findAll();
    }

    @PostMapping("/guest")
    public DiaryEntity createDiary(@RequestBody DiaryDto diaryDto) {
        System.out.println("Received diary DTO: " + diaryDto); // 요청 데이터 출력
        UserEntity user = userRepository.findById(diaryDto.getUserId())
            .orElseThrow(() -> new RuntimeException("User not found")); // 사용자 조회
        DiaryEntity diary = new DiaryEntity();
        diary.setUser(user); // 기존 사용자 엔티티 설정
        diary.setContent(diaryDto.getContent());
        diary.setCreatedAt(Timestamp.valueOf(LocalDateTime.now()));
        return diaryRepository.save(diary);
    }
}
