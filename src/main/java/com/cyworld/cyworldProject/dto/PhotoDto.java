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
public class PhotoDto {
    private int id;
    private int user_id;
    private int menu_id;
    private String album_title;
    private String p_text;
    private Timestamp wdate;
}