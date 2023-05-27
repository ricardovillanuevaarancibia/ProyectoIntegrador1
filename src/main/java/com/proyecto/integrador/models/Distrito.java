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
@Table(name = "ubdistrito")
@ToString
@EqualsAndHashCode
public class Distrito {


    @Id

    @Getter
    @Setter
    @Column(name = "idDist")
    private Long DistritoId;
    @Getter @Setter @Column(name = "idProv")
    private String ProvinciaId;
    @Getter @Setter @Column(name = "distrito")
    private String Descripcion;


}
