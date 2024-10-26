package com.cyworld.cyworldProject.dto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PhotoImgDto {
    private long id;
    private long photo_id;
    private String ofilename;
    private String nfilename;
    private String ext;
    private long filesize;
    private String imnum;
    private String photo_src;
}
