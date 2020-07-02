package com.siit.springhomework.mapper;

import com.siit.springhomework.domain.entity.SingerEntity;
import com.siit.springhomework.domain.model.Singer;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class SingerToSingerEntityMapper implements Converter<Singer, SingerEntity> {

    @Override
    public SingerEntity convert(Singer source) {
        return SingerEntity.builder()
                           .firstName(source.getFirstName())
                           .birthDate(source.getBirthDate())
                           .build();
    }
}
