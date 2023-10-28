package edu.crud.controller;

import edu.crud.entity.Inscripcion;
import edu.crud.repository.InscripcionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inscripciones")
public class InscripcionController {
    @Autowired
    private InscripcionRepository inscripcionRepository; // Inyecta el repositorio de Inscripcion

    @PostMapping
    public Inscripcion crearInscripcion(@RequestBody Inscripcion inscripcion) {
        return inscripcionRepository.save(inscripcion); // Crea una nueva inscripción
    }

    @GetMapping
    public List<Inscripcion> obtenerInscripciones() {
        return inscripcionRepository.findAll(); // Obtiene todas las inscripciones
    }

    @GetMapping("/{id}")
    public Inscripcion obtenerInscripcionPorId(@PathVariable Long id) {
        return inscripcionRepository.findById(id).orElse(null); // Obtiene una inscripción por su ID
    }

    @DeleteMapping("/{id}")
    public void eliminarInscripcion(@PathVariable Long id) {
        inscripcionRepository.deleteById(id); // Elimina una inscripción por su ID
    }


}
