package com.izi.er.model;

import com.izi.er.dto.PartientDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartientRepository extends JpaRepository<PartientDto,Integer> {

}
