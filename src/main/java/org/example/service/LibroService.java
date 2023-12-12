package org.example.service;

import org.example.model.Libro;

import java.util.List;

public interface LibroService {
    public List<Libro> mostrarTodo();
    public void agregarLibro(Libro libro);
public void actualizarLibro(Libro libro);
public void eliminarLibro(int id);

}
