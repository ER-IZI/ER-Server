package com.izi.er.model;

import com.izi.er.dto.InjuryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InjuryRepository extends JpaRepository<InjuryDto,Integer> {

}
