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
public class CommentDto {
    private long id;
    private long photo_id;
    private long author_id;
    private String comment;
    private Timestamp wdate;
}
