package com.siit.spring.homework.repository;

import com.siit.spring.homework.domain.entity.SingerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository //prin aceasta anotare s-a "importat" toata logica
public interface SingerRepository extends JpaRepository<SingerEntity, Long> {

}
