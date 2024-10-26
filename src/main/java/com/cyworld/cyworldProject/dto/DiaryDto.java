package com.cyworld.cyworldProject.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DiaryDto {
    private long id;
    private long userId; // 사용자 ID
    private String content; // 다이어리 내용
    private Timestamp createdAt; // 생성 시간
}