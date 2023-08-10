package com.izi.er.dto;

import lombok.Getter;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(schema = "er",name = "Hospital",indexes = @Index(columnList = "Latitude"))
public class HospitalDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HID" , length = 100)
    private int HID; //병원 코드

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<MedicalDepartmentDto> medicalDepartmentDto;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ReserveListDto> reserveListDto;

    @Column(name = "ID")// 로그인 ID
    private String ID;

    @Column(name = "Password") //로그인 비밀번호
    private String Password;

    @Column(name = "HName")
    private String HName; // 병원 이름

    @Column(name = "Latitude")
    private double Latitude; // 위도

    @Column(name = "Longtitude")
    private double Longtitude; // 경도

    @Column(name = "Pnumber")
    private String Pnumber; // 병원 전화번호

    @Column(name = "AER")
    private int AER; // 응급실 가용병수 (영어 모르겠음)\

    @Column(name = "RAER")
    private int RAER; // 남은 응급실 가용병수 (영어 모르겠음)\

    @Column(name = "MaxReserver")
    private int MaxReserver; // 병원 최대 예약 가능 수


}
