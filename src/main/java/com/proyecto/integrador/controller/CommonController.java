package com.proyecto.integrador.controller;

import com.proyecto.integrador.dao.CommonDao;
import com.proyecto.integrador.dao.OrdenDao;
import com.proyecto.integrador.models.Departamento;
import com.proyecto.integrador.models.Distrito;
import com.proyecto.integrador.models.Ordenes;
import com.proyecto.integrador.models.Provincia;
import com.proyecto.integrador.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedList;
import java.util.List;

@RestController
public class CommonController {
    @Autowired
    private CommonDao commonDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/Departamento", method = RequestMethod.GET)
    public List<Departamento> getDepartamento(@RequestHeader(value="Authorization") String token) {
        if (!validarToken(token)) { return null; }

        return commonDao.getDepartamento();
    }
    @RequestMapping(value = "api/Provincia", method = RequestMethod.GET)
    public List<Provincia> getProvincia(@RequestHeader(value="Authorization") String token) {
        if (!validarToken(token)) { return null; }

        return commonDao.getProvincia(1);
    }
    @RequestMapping(value = "api/Distrito", method = RequestMethod.GET)
    public List<Distrito> getDistrito(@RequestHeader(value="Authorization") String token) {
        if (!validarToken(token)) { return null; }

        return commonDao.getDistrito(1);
    }
    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

}
