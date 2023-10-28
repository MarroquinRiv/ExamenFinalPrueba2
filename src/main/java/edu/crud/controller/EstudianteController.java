package edu.crud.controller;

import edu.crud.entity.Estudiante;
import edu.crud.repository.EstudianteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/estudiantes")
public class EstudianteController {
    @Autowired
    private EstudianteRepository estudianteRepository; // Inyecta el repositorio de Estudiante

    @PostMapping
    public Estudiante crearEstudiante(@RequestBody Estudiante estudiante) {
        return estudianteRepository.save(estudiante); // Crea un nuevo estudiante
    }

    @GetMapping
    public List<Estudiante> obtenerEstudiantes() {
        return estudianteRepository.findAll(); // Obtiene todos los estudiantes
    }

    @GetMapping("/{id}")
    public Estudiante obtenerEstudiantePorId(@PathVariable Long id) {
        return estudianteRepository.findById(id).orElse(null); // Obtiene un estudiante por su ID
    }

    @DeleteMapping("/{id}")
    public void eliminarEstudiante(@PathVariable Long id) {
        estudianteRepository.deleteById(id); // Elimina un estudiante por su ID
    }

    // Puedes agregar más endpoints CRUD aquí, como @PutMapping para actualizar.
}
