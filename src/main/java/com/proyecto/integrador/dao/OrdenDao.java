package com.proyecto.integrador.dao;

import com.proyecto.integrador.models.Departamento;
import com.proyecto.integrador.models.Espacios;
import com.proyecto.integrador.models.Ordenes;

import java.util.List;

public interface OrdenDao {

    List<Ordenes> getAtendidos();
    List<Espacios> getEspacios();
    List<Ordenes> getReportes();
    List<Ordenes> getReservas();

}
