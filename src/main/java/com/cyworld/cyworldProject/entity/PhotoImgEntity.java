package com.cyworld.cyworldProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Timestamp;

@Entity
@Getter
@Setter
@Table(name = "photo_img")
@NoArgsConstructor
@AllArgsConstructor
public class PhotoImgEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "photo_id", referencedColumnName = "id", nullable = false)
    private PhotoEntity photo;

    @Column(name = "ofilename", nullable = false)
    private String originalFilename;

    @Column(name = "nfilename", nullable = false)
    private String newFilename;

    @Column(name = "ext", nullable = false)
    private String extension;

    @Column(name = "filesize", nullable = false)
    private long fileSize;

    @Column(name = "imnum", nullable = false)
    private String imageNumber;

    @Column(name = "photo_src", nullable = false)
    private String photoSource;
}
