package org.example.dao.impl;

import org.example.dao.LibroDAO;
import org.example.model.Libro;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibroDaoImpl implements LibroDAO {
    private Connection connection;

    @Override
    public List<Libro> mostrarTodo() {
        try {
            String sql = "select * from libros";
            PreparedStatement psmt = connection.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();
            List<Libro> libros = new ArrayList<>();
            while (resultSet.next()) {  //el puntero viaja o se desplaza de posicion
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                Boolean disponible = resultSet.getBoolean("disponible");
                Libro libroDb = new Libro();
                libroDb.setTitulo(titulo);
                libroDb.setAutor(autor);
                libroDb.setDisponible(disponible);
            }
            return libros;

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return null;
    }
        @Override
        public void agregarLibro (Libro libro){
            try{
                String sql = "insert into libros(titulo, autor, disponible) values(?,?,?)";
                PreparedStatement psmt  = connection.prepareStatement(sql);
                String titulo = libro.getTitulo();
                String autor = libro.getAutor();
                Boolean disponible = libro.getDisponible();

                psmt.setString(1,titulo);
                psmt.setString(2,autor);
                psmt.setBoolean(3,disponible);
                psmt.executeUpdate();
            }catch (Exception e){
                System.out.println(e.getMessage());
            }

        }

    @Override
    public void actualizarLibro(Libro libro) {
        try {
            String sql = "UPDATE libros SET titulo = valor1, autor = valor2 WHERE id = valor3;";
            PreparedStatement psmt = connection.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();
String titulo = libro.getTitulo();
String autor = libro.getAutor();
int id = libro.getLibro_id();

            psmt.setString(1,titulo);
            psmt.setString(2,autor);
            psmt.setInt(3,id);
            psmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarLibro(int id) {

        try {
            String sql = "DELETE FROM libros WHERE id = valor1;";
            PreparedStatement psmt = connection.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();

            psmt.setInt(1,id);

            psmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
