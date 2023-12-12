package org.example.service.impl;

import org.example.dao.LibroDAO;
import org.example.model.Libro;
import org.example.service.LibroService;

import java.util.List;

public class LibroServiceImpl implements LibroService {
    LibroDAO libroDAO;
    public LibroServiceImpl(LibroDAO libroDAO){
        this.libroDAO = libroDAO;
    }
    @Override
    public List<Libro> mostrarTodo() {

        return  libroDAO.mostrarTodo() ;
    }

    @Override
    public void agregarLibro(Libro libro) {
    libroDAO.agregarLibro(libro);
    }

    @Override
    public void actualizarLibro(Libro libro) {
    libroDAO.actualizarLibro(libro);
    }

    @Override
    public void eliminarLibro(int id) {
    libroDAO.eliminarLibro(id);
    }
}
