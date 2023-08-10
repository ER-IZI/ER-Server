package com.izi.er.dto;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(schema = "er",name = "ReserveList")
public class ReserveListDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RID")
    private int RID; // 예약 코드

    @ManyToOne(optional = false)
    @JoinColumn(name = "HID")
    private HospitalDto HID; // 병원 코드

    @ManyToOne(optional = false)
    @JoinColumn(name = "PID")
    private PartientDto PID; //환자 코드

    @Column(name = "Name")
    private String Name; //환자 이름

    @Column(name = "Approve")
    private boolean Approve; //예약 승인

    @Column(name = "ICheck")
    private boolean ICheck; //입실 체크
}
