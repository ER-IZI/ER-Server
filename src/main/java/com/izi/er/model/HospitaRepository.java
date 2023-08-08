package com.izi.er.model;


import com.izi.er.dto.HospitalDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HospitaRepository extends JpaRepository<HospitalDto,Integer> {

}
