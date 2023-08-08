package com.izi.er.model;

import com.izi.er.dto.MedicalDepartmentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MedicalDepartmentRepository extends JpaRepository<MedicalDepartmentDto,Integer> {

}
