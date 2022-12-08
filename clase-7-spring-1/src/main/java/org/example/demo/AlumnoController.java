package org.example.demo;

import org.example.demo.connection.AlumnoRepository;
import org.example.demo.entidades.Alumno;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlumnoController {
    @Autowired
    private AlumnoRepository alumnoRepository;
    @GetMapping(value = "hola")
    public ResponseEntity<?> holaMund() {
        return ResponseEntity.ok("Hola Mundo");
    }
    // CRUD ###################################


    //CREATE -------------------------
    //http://localhost:8080/alumno/crear
    @GetMapping(value = "alumno/crear")
    public ResponseEntity<?> crearAlumno() {
        Alumno nuevoAlumno = new Alumno(
                "Roger",
                "Mendez",
                11111,
                2222
        );

        return ResponseEntity.ok(alumnoRepository.save(nuevoAlumno));
    }

    //READ -------------------------
    //http://localhost:8080/alumno/leer/12345
    @GetMapping(value = "alumno/leer/{dni}")
    public ResponseEntity<?> obtenerAlumnosPorDNI(@PathVariable(name = "dni") final Long dni) {
        return ResponseEntity.ok(alumnoRepository.getReferenceById(dni));
    }
    //http://localhost:8080/alumno/leer/todos
    @GetMapping(value = "alumno/leer/todos")
    public ResponseEntity<?> obtenerTodosLosAlumnos() {
        return ResponseEntity.ok(alumnoRepository.findAll());
    }

    //READ -------------------------
    //http://localhost:8080/alumno/actualizar/12345
    @GetMapping(value = "alumno/actualizar/{dni}")
    public ResponseEntity<?> actualizarNombrePorDNI(@PathVariable(name = "dni") final Long dni) {
        Alumno alumno = alumnoRepository.getReferenceById(dni);
        alumno.setNombre("NombreNuevo");
        return ResponseEntity.ok(alumnoRepository.save(alumno));
    }
}
