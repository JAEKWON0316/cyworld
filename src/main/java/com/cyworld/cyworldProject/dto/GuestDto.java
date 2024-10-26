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
public class GuestDto {
    private long id;
    private long user_id;
    private long author_id;
    private String message;
    private Timestamp wdate;
    private int visible;
}
