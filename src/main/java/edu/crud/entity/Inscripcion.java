package edu.crud.entity;

import jakarta.persistence.*;

@Entity // Anotación que indica que esta clase es una entidad mapeada a una tabla en la base de datos
@Table(name = "inscripciones") // Nombre personalizado de la tabla en la base de datos
public class Inscripcion {
    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Generación automática de valores para la clave primaria
    private Long id; // Identificador único de la inscripción
    private Long idEstudiante; // Identificador del estudiante inscrito
    private Long idCurso; // Identificador del curso al que se inscribe el estudiante

    // Constructor por defecto
    public Inscripcion() {
    }

    // Constructor con parámetros
    public Inscripcion(Long idEstudiante, Long idCurso) {
        this.idEstudiante = idEstudiante;
        this.idCurso = idCurso;
    }

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public Long getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Long idCurso) {
        this.idCurso = idCurso;
    }
}