package com.izi.er.model;

import com.izi.er.dto.InjuryDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface InjuryRepository extends JpaRepository<InjuryDto,Integer> {


    @Modifying
    @Transactional
    @Query("DELETE FROM InjuryDto I WHERE I.IID = :IID")
    void deleteByRoomID(@Param("IID") int IID);
}
