package com.cyworld.cyworldProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.cyworld.cyworldProject.entity.DiaryEntity;

public interface DiaryRepository extends JpaRepository<DiaryEntity, Long> {
    // 추가 쿼리 메서드 정의 가능
}