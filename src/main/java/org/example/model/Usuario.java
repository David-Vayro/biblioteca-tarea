package org.example.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class Usuario {
    private int id;
    private String nombre;
    private String apellido;
    private  String distrito;

    public Usuario(int id, String nombre, String apellido, String distrito) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.distrito = distrito;
    }
    public void mostrarLibro() {
        System.out.println(" nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println(" distrito: " + distrito);
    }
}
