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
    private int PID;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<InjuryDto> injuryDtos;

    @OneToMany(cascade = CascadeType.REMOVE, orphanRemoval = true)
    private List<ReserveListDto> reserveListDto;

    @Column(name = "ID")
    private String ID;

    @Column(name = "Password")
    private String Password;

    @Column(name = "Type")
    private int Type;  // (1 = 일반 , 2 = 응급);

    @Column(name = "Pnumber")
    private String Pnumber;
}
