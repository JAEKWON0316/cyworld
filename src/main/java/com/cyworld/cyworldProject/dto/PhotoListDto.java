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
public class PhotoListDto {
    private int id;
    private int user_id;
    private String menu_title;
    private Timestamp wdate;
    private int visible;
}
