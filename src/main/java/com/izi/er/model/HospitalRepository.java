package com.izi.er.model;


import com.izi.er.Domain.Location;
import com.izi.er.dto.HospitalDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface HospitalRepository extends JpaRepository<HospitalDto,Integer> {

    @Query("SELECT H FROM HospitalDto H WHERE H.HName = :HName")
    HospitalDto getHospitalbyHName(@Param("HName")String HName);

    @Query("SELECT COUNT(H) > 0 FROM HospitalDto H WHERE H.ID = :ID")
    boolean existsByID(@Param("ID") String ID);

    @Query("SELECT H.Pnumber FROM HospitalDto H WHERE H.HID = :HID")
    String getPnumberbyHID(@Param("HID")int HID);

    @Query("SELECT H.HID FROM HospitalDto H WHERE H.HName = :HName")
    String getHIDbyHName(@Param("HName")String HName);

    @Query("SELECT H.Latitude,H.Longtitude FROM HospitalDto H WHERE H.Latitude =:Latitude")
    Location getLocation(@Param("Latitude")double Latitude);










    @Modifying
    @Transactional
    @Query("UPDATE HospitalDto H SET H.RAER = H.RAER + 1 WHERE H.HID = :HID")
    void plusRAER(@Param("HID")int HID);

    @Modifying
    @Transactional
    @Query("UPDATE HospitalDto H SET H.RAER = H.RAER - 1 WHERE H.HID = :HID")
    void minusRAER(@Param("HID")int HID);

    @Modifying
    @Transactional
    @Query("UPDATE HospitalDto H SET H.MaxReserver = :MaxReserver WHERE H.HID = :HID")
    void UpdateMax(@Param("HID")int HID , @Param("MaxReserver")int MaxReserver);

    @Modifying
    @Transactional
    @Query("UPDATE HospitalDto H SET H.Latitude = :Latitude, H.Longtitude = :Longtitude WHERE H.HID = :HID")
    void UpdateLocation(@Param("HID") int HID, @Param("Latitude") double Latitude, @Param("Longtitude") double Longtitude);









    @Modifying
    @Transactional
    @Query("DELETE FROM HospitalDto H WHERE H.HID = :HID")
    void deleteByRoomID(@Param("HID") int HID);

}
