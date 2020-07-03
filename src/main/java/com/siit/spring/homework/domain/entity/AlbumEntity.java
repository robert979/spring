package com.siit.spring.homework.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name="album")
@Data
public class AlbumEntity {




    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private long id;

    private String title;
    private LocalDate releaseDate;

    @ManyToOne //se declara tipul de asociere dintre Singer/SINGER_ID si tabelul Album
    @JoinColumn(name ="SINGER_ID") //este foreignKey, detine relatia
    private SingerEntity singerEntity;


}
