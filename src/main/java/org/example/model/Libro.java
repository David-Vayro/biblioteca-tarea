package org.example.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter

@NoArgsConstructor
public class Libro {
    private int libro_id;
    private String titulo;
    private String autor;
    private Boolean disponible;

    public Libro(int libro_id, String titulo, String autor, Boolean disponible) {
        this.libro_id = libro_id;
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = disponible;
    }
public void mostrarLibro(){
    System.out.println(" titulo: " + titulo);
    System.out.println("autor: " + autor);
    System.out.println(" disponible: " + disponible);
}

}
