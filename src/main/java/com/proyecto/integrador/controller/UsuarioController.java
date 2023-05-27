package com.proyecto.integrador.controller;

import com.proyecto.integrador.dao.UsuarioDao;
import com.proyecto.integrador.models.Usuario;
import com.proyecto.integrador.utils.JWTUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class UsuarioController {
    @Autowired
    private UsuarioDao usuarioDao;

    @Autowired
    private JWTUtil jwtUtil;

    @RequestMapping(value = "api/usuarios", method = RequestMethod.GET)
    public List<Usuario> getUsuarios(@RequestHeader(value="Authorization") String token) {
        if (!validarToken(token)) { return null; }

        return usuarioDao.getUsuarios();
    }

    private boolean validarToken(String token) {
        String usuarioId = jwtUtil.getKey(token);
        return usuarioId != null;
    }

    @RequestMapping(value = "api/usuarios", method = RequestMethod.POST)
    public void registrarUsuario(@RequestBody Usuario usuario) {



        usuarioDao.registrar(usuario);
    }

    @RequestMapping(value = "api/usuarios/{id}", method = RequestMethod.DELETE)
    public void eliminar(@RequestHeader(value="Authorization") String token,
                         @PathVariable Long id) {
        if (!validarToken(token)) { return; }
        usuarioDao.eliminar(id);
    }
}
