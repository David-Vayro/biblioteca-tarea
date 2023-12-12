package org.example.dao.impl;

import org.example.dao.UsuarioDAO;
import org.example.model.Libro;
import org.example.model.Usuario;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDaoImpl implements UsuarioDAO {
    private Connection connection;
    @Override
    public List<Usuario> mostrarUsuarios() {  try {
        String sql = "select * from usuarios";
        PreparedStatement psmt = connection.prepareStatement(sql);
        ResultSet resultSet = psmt.executeQuery();
        List<Usuario> usuarios = new ArrayList<>();
        while (resultSet.next()) {
            String nombre = resultSet.getString("nombre");
            String apellido = resultSet.getString("apellido");
            String distrito = resultSet.getString("distrito");
            Usuario usuarioDb = new Usuario();
            usuarioDb.setNombre(nombre);
            usuarioDb.setApellido(apellido);
            usuarioDb.setDistrito(distrito);
        }
        return usuarios;

    } catch (SQLException e) {
        System.out.println(e.getMessage());
    }
        return null;
    }

    @Override
    public void agregarUsuario(Usuario usuario) {
        try{
            String sql = "insert into usuarios(nombre, apellido, distrito) values(?,?,?)";
            PreparedStatement psmt  = connection.prepareStatement(sql);
            String nombre = usuario.getNombre();
            String apellido = usuario.getApellido();
            String distrito = usuario.getDistrito();

            psmt.setString(1,nombre);
            psmt.setString(2,apellido);
            psmt.setString(3,distrito);
            psmt.executeUpdate();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void actualizarUsuario(Usuario usuario) {
        try {
            String sql = "UPDATE usuarios SET nombre = valor1, apellido = valor2, distrito = valor3 WHERE id = valor4;";
            PreparedStatement psmt = connection.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();
            String nombre = usuario.getNombre();
            String apellido = usuario.getApellido();
            String distrito = usuario.getDistrito();
            int id = usuario.getId();

            psmt.setString(1,nombre);
            psmt.setString(2,apellido);
            psmt.setString(3,distrito);
            psmt.setInt(4,id);
            psmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void eliminarUsuario(int id) {
        try {
            String sql = "DELETE FROM usuarios WHERE id = valor1;";
            PreparedStatement psmt = connection.prepareStatement(sql);
            ResultSet resultSet = psmt.executeQuery();

            psmt.setInt(1,id);

            psmt.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }


}
