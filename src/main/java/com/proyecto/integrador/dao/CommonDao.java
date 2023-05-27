package com.proyecto.integrador.dao;

import com.proyecto.integrador.models.Departamento;
import com.proyecto.integrador.models.Distrito;
import com.proyecto.integrador.models.Provincia;
import com.proyecto.integrador.models.Usuario;

import java.util.List;

public interface CommonDao {

    List<Departamento> getDepartamento();
    List<Provincia> getProvincia(int IdDepartamento);
    List<Distrito> getDistrito(int Idprovincia);
}
