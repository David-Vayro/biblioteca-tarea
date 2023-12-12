package org.example.service.impl;

import org.example.dao.UsuarioDAO;
import org.example.model.Usuario;
import org.example.service.UsuarioService;

import java.util.List;

public class UsuarioServiceImpl implements UsuarioService {
UsuarioDAO usuarioDAO;

    public UsuarioServiceImpl(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public List<Usuario> mostrarUsuarios() {
        return usuarioDAO.mostrarUsuarios();
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
    usuarioDAO.agregarUsuario(usuario);
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
    usuarioDAO.actualizarUsuario(usuario);
    }

    @Override
    public void eliminarUsuario(int id) {
        usuarioDAO.eliminarUsuario(id);
    }
}
