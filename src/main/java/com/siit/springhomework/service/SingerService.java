package com.siit.springhomework.service;

import com.siit.springhomework.domain.entity.SingerEntity;
import com.siit.springhomework.domain.model.Singer;
import com.siit.springhomework.exception.SingerNotFoundException;
import com.siit.springhomework.mapper.SingerEntityToSingerMapper;
import com.siit.springhomework.mapper.SingerToSingerEntityMapper;
import com.siit.springhomework.repository.SingerRepository;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class SingerService {

    private final SingerRepository repository;

    private final SingerEntityToSingerMapper singerEntityToSingerMapper;

    private final SingerToSingerEntityMapper singerToSingerEntityMapper;

    public Singer create(Singer singer) {
        SingerEntity singerEntity = singerToSingerEntityMapper.convert(singer);
        SingerEntity savedEntity = repository.save(singerEntity);
        return singerEntityToSingerMapper.convert(savedEntity);
    }

    public Singer findById(long singerId) {
        return repository.findById(singerId)
//                       .map(mapper::convert)
                         .map((SingerEntity singerEntity) -> singerEntityToSingerMapper.convert(singerEntity))
                         .orElseThrow(() -> new SingerNotFoundException("The singer with id provided cannot be found"));
    }

    public List<Singer> getAll() {
        return repository.getAll()
                         .stream()
                         .map(singerEntityToSingerMapper::convert)
                         .collect(Collectors.toList());
    }

    public Singer update(Singer singer) {
        SingerEntity singerEntity = singerToSingerEntityMapper.convert(singer);
        singerEntity.setId(singer.getId());
        SingerEntity savedEntity = repository.save(singerEntity);

        return singerEntityToSingerMapper.convert(savedEntity);
    }

    @Transactional //
    public void updateTransactional(Singer singer) {
        SingerEntity existingEntity = repository.findById(singer.getId())
                                                .orElseThrow(() -> new SingerNotFoundException("The singer with id provided cannot be found"));

        updateFields(existingEntity, singer);
    }

    private void updateFields(SingerEntity existingEntity, Singer singer) {
        existingEntity.setBirthDate(singer.getBirthDate());
        existingEntity.setFirstName(singer.getFirstName());
        existingEntity.setLastName(singer.getLastName());
    }
}
