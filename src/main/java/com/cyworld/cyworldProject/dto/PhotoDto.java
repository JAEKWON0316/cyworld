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
    private long id;
    private long user_id;
    private long menu_id;
    private String album_title;
    private String p_text;
    private Timestamp wdate;
}
