package org.example.dao;

import org.example.model.Libro;

import java.util.List;

public interface LibroDAO {
    public List<Libro> mostrarTodo();
    public void agregarLibro(Libro libro);
    public void actualizarLibro(Libro libro);
    public void eliminarLibro(int id);

}
