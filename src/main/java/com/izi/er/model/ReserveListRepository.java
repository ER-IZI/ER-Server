package com.izi.er.model;

import com.izi.er.dto.ReserveListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReserveListRepository extends JpaRepository<ReserveListDto,Integer> {

}
