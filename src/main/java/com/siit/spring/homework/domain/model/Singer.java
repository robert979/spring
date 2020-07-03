package com.siit.spring.homework.domain.model;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Builder
@Data

public class Singer {

    private long id;

    private String firstName;

    private String lastName;

    private LocalDate birthDate;

    private List<Album> albums;
}
