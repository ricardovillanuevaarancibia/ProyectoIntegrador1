package com.proyecto.integrador.dao;

import com.proyecto.integrador.models.Departamento;
import com.proyecto.integrador.models.Espacios;
import com.proyecto.integrador.models.Ordenes;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.LinkedList;
import java.util.List;
@Repository
@Transactional
public class OrdenDaoImp implements OrdenDao {
    @Override
    public List<Ordenes> getAtendidos() {
       List<Ordenes> lstAtendidos;

        lstAtendidos = new LinkedList<Ordenes>();
        lstAtendidos.add(new Ordenes("Luis","215454545","01/05/2023","S/100","1","Atendido"));
        lstAtendidos.add(new Ordenes("Moises","215454545","01/05/2023","S/100","1","Atendido"));

        lstAtendidos.add(new Ordenes("Cesar","215454545","01/05/2023","S/100","1","Atendido"));
        lstAtendidos.add(new Ordenes("Irene","215454545","01/05/2023","S/100","1","Atendido"));
        lstAtendidos.add(new Ordenes("Fatima","215454545","01/05/2023","S/100","1","Atendido"));
        lstAtendidos.add(new Ordenes("Luna","215454545","01/05/2023","S/100","1","Atendido"));
        lstAtendidos.add(new Ordenes("Deysi","215454545","01/05/2023","S/100","1","Atendido"));
        lstAtendidos.add(new Ordenes("Elvis","215454545","01/05/2023","S/100","1","Atendido"));

       return lstAtendidos;
    }

    @Override
    public List<Espacios> getEspacios() {
        List<Espacios> lstEspacio;

        lstEspacio = new LinkedList<Espacios>();
        lstEspacio.add(new Espacios("1","Lima","Lima","Ate","Tagore1"));
        lstEspacio.add(new Espacios("2","Lima","Lima","Ate","Tagore1"));
        lstEspacio.add(new Espacios("3","Lima","Lima","Ate","Tagore1"));
        lstEspacio.add(new Espacios("4","Lima","Lima","Ate","Trabajo"));
        lstEspacio.add(new Espacios("5","Lima","Lima","Ate","Trabajo"));
        lstEspacio.add(new Espacios("6","Lima","Lima","Ate","Trabajo"));
        lstEspacio.add(new Espacios("7","Lima","Lima","Ate","Trabajo"));

        return lstEspacio;
    }

    @Override
    public List<Ordenes> getReportes() {
        return null;
    }

    @Override
    public List<Ordenes> getReservas() {
        List<Ordenes> lstAtendidos;

        lstAtendidos = new LinkedList<Ordenes>();
        lstAtendidos.add(new Ordenes("Luis","215454545","01/05/2023","S/100","1","Reservado"));
        lstAtendidos.add(new Ordenes("Ricardo","215454545","01/05/2023","S/110","1","Reservado"));

        lstAtendidos.add(new Ordenes("Teresa","215454545","01/05/2023","S/120","1","Reservado"));
        lstAtendidos.add(new Ordenes("Sefora","215454545","01/05/2023","S/130","1","Reservado"));
        lstAtendidos.add(new Ordenes("Rebeca","215454545","01/05/2023","S/140","1","Reservado"));
        lstAtendidos.add(new Ordenes("Maria","215454545","01/05/2023","S/80","1","Reservado"));
        lstAtendidos.add(new Ordenes("Jose","215454545","01/05/2023","S/90","1","Reservado"));
        lstAtendidos.add(new Ordenes("David","215454545","01/05/2023","S/20","1","Reservado"));

        return lstAtendidos;
    }
}
