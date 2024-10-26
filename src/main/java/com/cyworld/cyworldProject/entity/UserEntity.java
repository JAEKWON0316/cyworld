package com.cyworld.cyworldProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@Table(name = "user") // 데이터베이스의 테이블 이름을 명시적으로 지정
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username", nullable = false, unique = true)
    private String username;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "wdate", nullable = false)
    private Timestamp wdate; // 생성 시간

    @Column(name = "p_number", nullable = false, unique = true)
    private String pNumber;

    @Column(name = "gender", nullable = false)
    private int gender;

    @Column(name = "b_date", nullable = false)
    private LocalDate bDate;
}
