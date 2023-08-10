package com.izi.er.model;

import com.izi.er.dto.CompleteListDto;
import com.izi.er.dto.HospitalDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CompleteListRepository extends JpaRepository<CompleteListDto,Integer> {

    @Query("SELECT C FROM CompleteListDto C WHERE C.Name =:Name")
    List<HospitalDto> getListbyName(@Param("Name")String Name);



}
