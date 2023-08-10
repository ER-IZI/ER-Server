package com.izi.er.dto;


import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(schema = "er",name = "MedicalDepartment")
public class MedicalDepartmentDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "DID")
    private int DID; // 부서 코드

    @ManyToOne(optional = false)
    @JoinColumn(name = "HID")
    private HospitalDto HID; // 병원 코드

    @Column(name = "Department")
    private String Department; // 부서 이름

    @Column(name = "Acheck")
    private boolean Acheck; // 진료가능 여부,   false == 진료 x  , true == 진료 O




}
