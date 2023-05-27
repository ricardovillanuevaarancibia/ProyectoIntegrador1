package com.proyecto.integrador.controller;


import com.proyecto.integrador.dao.OrdenDao;
import com.proyecto.integrador.dao.UsuarioDao;
import com.proyecto.integrador.models.Ordenes;
import com.proyecto.integrador.models.Usuario;
import com.proyecto.integrador.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AtendidosController {
    @Autowired
    private OrdenDao ordenDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/atendidos", method = RequestMethod.GET)
    public List<Ordenes> getAtendidos() {

        return ordenDao.getAtendidos();
    }

    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }




}
