package org.example.service;

import org.example.model.Libro;
import org.example.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> mostrarUsuarios();
    public void agregarUsuario(Usuario usuario);
    public void actualizarUsuario(Usuario usuario);
    public void eliminarUsuario(int id);
}
