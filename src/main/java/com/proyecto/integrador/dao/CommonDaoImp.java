package com.proyecto.integrador.dao;

import com.proyecto.integrador.models.Departamento;
import com.proyecto.integrador.models.Distrito;
import com.proyecto.integrador.models.Provincia;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;
@Repository
@Transactional
public class CommonDaoImp implements CommonDao{

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public List<Departamento> getDepartamento() {
        String query = "FROM Departamento";
        return entityManager.createQuery(query).getResultList();
    }

    @Override
    public List<Provincia> getProvincia(int IdDepartamento) {
        TypedQuery<Provincia> query = entityManager.createQuery(
                "SELECT e FROM Provincia e WHERE e.DepartamentoId =:variable" , Provincia.class);
        int DepartamentoId = IdDepartamento;
        List<Provincia> provincias = query.setParameter("variable", IdDepartamento).getResultList();
        return provincias;
    }

    @Override
    public List<Distrito> getDistrito(int Idprovincia) {
        TypedQuery<Distrito> query = entityManager.createQuery(
                "SELECT e FROM Distrito e WHERE e.ProvinciaId =:variable" , Distrito.class);
        int DepartamentoId = Idprovincia;
        List<Distrito> distritos = query.setParameter("variable", Idprovincia).getResultList();
        return distritos;
    }
}
