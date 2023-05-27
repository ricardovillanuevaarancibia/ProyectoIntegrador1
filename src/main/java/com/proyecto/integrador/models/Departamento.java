package com.proyecto.integrador.models;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "ubdepartamento")
@ToString
@EqualsAndHashCode
public class Departamento {

    @Id

    @Getter
    @Setter
    @Column(name = "idDepa")
    private Long DepartamentoId;

    @Getter @Setter @Column(name = "departamento")
    private String Descripcion;




}
