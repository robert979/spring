package com.siit.spring.homework.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
@Data
@Builder

public class Album {


        private long id;

        private String title;

        private LocalDate releaseDate;

        private Singer singer;
}
