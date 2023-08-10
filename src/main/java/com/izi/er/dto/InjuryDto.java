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
    private int IID; // 부상 ID

    @ManyToOne(optional = false)
    @JoinColumn(name = "")
    private PartientDto PID; // 환자 코드

    @Column(name = "Injury")
    private String Injury; // 부상 명

    @Column(name = "Severity")
    private int Severity; // 부상 중증도

}
