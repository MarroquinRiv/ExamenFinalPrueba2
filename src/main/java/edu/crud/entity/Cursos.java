package edu.crud.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "cursos") // Nombre personalizado de la tabla en la base de datos
public class Cursos{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Identificador único del curso
    private String nombre; // Nombre del curso
    private String descripcion; // Descripción del curso

    // Constructor por defecto
    public Cursos() {
    }

    // Constructor con parámetros
    public Cursos(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
