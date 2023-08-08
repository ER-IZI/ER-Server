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
    private int DID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "HID")
    private HospitalDto HID;

    @Column(name = "Department")
    private String Department;

    @Column(name = "Acheck")
    private boolean Acheck; // false == 진료 x  , true == 진료 O




}
