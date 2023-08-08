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
    private int RID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "HID")
    private HospitalDto HID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "PID")
    private PartientDto PID;

    @Column(name = "Check")
    private boolean Check;
}
