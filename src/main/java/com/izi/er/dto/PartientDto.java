package com.izi.er.dto;

import lombok.Getter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Table(schema = "er",name = "Partient")
public class PartientDto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PID")
    private int PID; // 환자 코드

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<InjuryDto> injuryDtos; //부상 리스트

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ReserveListDto> reserveListDto; // 예약 리스트

    @Column(name = "ID")
    private String ID; //환자 ID

    @Column(name = "Password")
    private String Password; // 환자 비밀번호

    @Column(name = "Type")
    private int Type;  // 환자 구분번호 (1 = 일반 , 2 = 응급);

    @Column(name = "Pnumber")
    private String Pnumber; // 환자 전화 번호
}
