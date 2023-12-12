package org.example.dao;

import org.example.model.Usuario;

import java.util.List;

public interface UsuarioDAO {
    public List<Usuario> mostrarUsuarios();
    public void agregarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(int id);
}
