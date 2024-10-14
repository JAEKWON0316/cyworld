package com.cyworld.cyworldProject.dto;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users") // 데이터베이스의 테이블 이름을 명시적으로 지정
public class UserDto {
    private Long id;
    private String username;
    private String password;
}
