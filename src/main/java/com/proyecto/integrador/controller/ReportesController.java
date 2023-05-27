package com.proyecto.integrador.controller;

import com.proyecto.integrador.dao.UsuarioDao;
import com.proyecto.integrador.models.Usuario;
import com.proyecto.integrador.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ReportesController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;



    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }


}
