package com.cyworld.cyworldProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "guest")
@NoArgsConstructor
@AllArgsConstructor
public class GuestEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", nullable = false) //방명록 주인의 id(미니홈피 주인) 
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "author_id", referencedColumnName = "id", nullable = false) //글 작성자의 id
    private UserEntity author;

    @Column(name = "message", nullable = false)
    private String message;

    @Column(name = "wdate", nullable = false)
    private Timestamp wdate;

    @Column(name = "visible", nullable = false)
    private int visible;
}
