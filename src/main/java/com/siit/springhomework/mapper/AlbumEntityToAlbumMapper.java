package com.siit.springhomework.mapper;

import com.siit.springhomework.domain.entity.AlbumEntity;
import com.siit.springhomework.domain.model.Album;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class AlbumEntityToAlbumMapper implements Converter<AlbumEntity, Album> {

    @Override
    public Album convert(AlbumEntity source) {
        return Album.builder()
                    .id(source.getId())
                    .releaseDate(source.getReleaseDate())
                    .build();
    }
}
