package com.izi.er.dto;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
@Table(schema = "er",name = "Injury")
public class InjuryDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IID",length = 100)
    private int IID;

    @ManyToOne(optional = false)
    @JoinColumn(name = "")
    private HospitalDto PID;

    @Column(name = "Injury")
    private String Injury;

    @Column(name = "Severity")
    private int Severity;

}
