package com.izi.er.model;

import com.izi.er.dto.ReserveListDto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ReserveListRepository extends JpaRepository<ReserveListDto,Integer> {

    @Query("SELECT R.RID FROM ReserveListDto R WHERE R.HID =:HID")
    List<String> getRIDbyHID(@Param("HID")int HID);

    @Query("SELECT R.RID FROM ReserveListDto R WHERE R.PID = :PID")
    String getRIDbyPID(@Param("PID")int PID);

    @Query("SELECT R.RID FROM ReserveListDto R WHERE R.HID = :HID AND R.PID = :PID")
    String getRIDbyHPID(@Param("HID")int HID , @Param("PID")int PID);


    @Modifying
    @Transactional
    @Query("UPDATE ReserveListDto R SET R.Approve = 1 WHERE R.HID = :HID AND R.PID = :PID")
    void UpdateApprove(@Param("HID")int HID , @Param("PID")int PID);

    @Modifying
    @Transactional
    @Query("UPDATE ReserveListDto R SET R.ICheck = 1 WHERE R.HID = :HID AND R.PID = :PID")
    void UpdateCheck(@Param("HID")int HID , @Param("PID")int PID);



}
