package com.siit.spring.homework.domain.entity;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity //pentru a fi o entitate din JPA

@Table(name="singer") // pentru a se mapa pe un tabel; e bine de dat numele chiar daca bydefault ia numele clasei
@Data
public class SingerEntity {

    @Id //pentru nominalizare ID
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    //se declara ca este autoincrement, si se numeste strategia de
    //generare, pentru a se incrementa cu strategia din baza
    //aka cu incrementul din baza;
    private long id;

    private String firstName;
    private String lastName;
    private LocalDate birthDate;

    @OneToMany(mappedBy = "singer")  //mapp-are bidirectionala
    private List<AlbumEntity> albums;
}
