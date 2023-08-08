package com.izi.er.dto;

import lombok.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(schema = "er",name = "Hospital")
public class HospitalDto {

    @Id
    @Column(name = "HID" , length = 100)
    private int HID;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<MedicalDepartmentDto> medicalDepartmentDto;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ReserveListDto> reserveListDto;

    @Column(name = "ID")
    private String ID;

    @Column(name = "Password")
    private String Password;

    @Column(name = "HName")
    private String HName;

    @Column(name = "Location")
    private Double Location;

    @Column(name = "Pnumber")
    private String Pnumber;

    @Column(name = "AER")
    private int AER; // 응급실 가용병수 (영어 모르겠음)

    @Column(name = "MaxReserver")
    private int MaxReserver;



    private String Type;
    private String PNumber;



}
