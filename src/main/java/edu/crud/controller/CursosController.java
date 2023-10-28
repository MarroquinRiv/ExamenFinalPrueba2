package edu.crud.controller;

import edu.crud.entity.Cursos;
import edu.crud.repository.CursosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // Anotación que indica que esta clase es un controlador REST
@RequestMapping("/cursos") // Define la raíz de la ruta para este controlador
public class CursosController {
    @Autowired //Sirve para realizar la inyeccion de depencias de manera automatica
    private CursosRepository cursoRepository; // Inyecta el repositorio de Cursos

    @PostMapping
    public Cursos crearCurso(@RequestBody Cursos curso) {
        return cursoRepository.save(curso);
    }

    @GetMapping
    public List<Cursos> obtenerCursos() {
        return cursoRepository.findAll();
    }

    @GetMapping("/{id}")
    public Optional<Cursos> obtenerCursoPorId(@PathVariable Long id) {
        return cursoRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void eliminarCurso(@PathVariable Long id) {
        cursoRepository.deleteById(id);
    }

}
