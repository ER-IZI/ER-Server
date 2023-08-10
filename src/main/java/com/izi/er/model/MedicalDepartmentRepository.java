package com.izi.er.model;

import com.izi.er.dto.MedicalDepartmentDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface MedicalDepartmentRepository extends JpaRepository<MedicalDepartmentDto,Integer> {

    @Modifying
    @Transactional
    @Query("UPDATE MedicalDepartmentDto M SET M.Acheck = 1 WHERE M.HID = :HID AND M.Department = :Department")
    void UpdateAcheckT(@Param("HID")int HID , @Param("Department")int Department);

    @Modifying
    @Transactional
    @Query("UPDATE MedicalDepartmentDto M SET M.Acheck = 0 WHERE M.HID = :HID AND M.Department = :Department")
    void UpdateAcheckF(@Param("HID")int HID , @Param("Department")int Department);



}
