package com.proyecto.integrador.controller;

import com.proyecto.integrador.dao.OrdenDao;
import com.proyecto.integrador.dao.UsuarioDao;
import com.proyecto.integrador.models.Espacios;
import com.proyecto.integrador.models.Usuario;
import com.proyecto.integrador.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EspaciosController {

    @Autowired
    private OrdenDao espacioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/espacios", method = RequestMethod.GET)
    public List<Espacios> getUsuarios() {


        return espacioDao.getEspacios();
    }

    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }




}
