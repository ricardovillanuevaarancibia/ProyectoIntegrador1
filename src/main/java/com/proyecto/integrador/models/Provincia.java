package com.proyecto.integrador.models;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ubprovincia")
@ToString
@EqualsAndHashCode
public class Provincia {

    @Id

    @Getter
    @Setter
    @Column(name = "idDist")

    private String ProvinciaId;

    @Getter @Setter @Column(name = "idDepa")
    private Long DepartamentoId;



    @Getter @Setter @Column(name = "provincia")
    private String Descripcion;

}
