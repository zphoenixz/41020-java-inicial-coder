package org.example.demo;

import org.example.demo.Repositories.ClienteRepository;
import org.example.demo.Repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/domicilio")
public class DomicilioController {
    @Autowired
    private DomicilioRepository domicilioRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    //CREATE -------------------------
    //http://localhost:8080/domicilio/crear1
    @GetMapping(value = "crear1")
    public ResponseEntity<?> crearDomicilio1() {
        Long clienteId = 1L;
        Cliente clienteUno = clienteRepository.getReferenceById(clienteId);

        Domicilio domicilio = new Domicilio(
                "Gran Mariscal",
                123,
                2,
                "100A",
                "aaa",
                "rio grande",
                "Salta",
                clienteUno
        );

        return ResponseEntity.ok(domicilioRepository.save(domicilio));
    }

    //http://localhost:8080/domicilio/crear2
    @GetMapping(value = "crear2")
    public ResponseEntity<?> crearDomicilio2() {
        Long clienteId = 1L;
        Cliente clienteDos = clienteRepository.findById(clienteId).get();

        Domicilio domicilio = new Domicilio(
                "Gran General",
                321,
                1,
                "200B",
                "bbb",
                "mar asd",
                "Buenos aires",
                clienteDos
        );

        return ResponseEntity.ok(domicilioRepository.save(domicilio));
    }



//    //READ -------------------------
//    //http://localhost:8080/alumno/leer/12345
//    @GetMapping(value = "alumno/leer/{dni}")
//    public ResponseEntity<?> obtenerAlumnosPorDNI(@PathVariable(name = "dni") final Long dni) {
//        return ResponseEntity.ok(clienteRepository.getReferenceById(dni));
//    }
//    //http://localhost:8080/alumno/leer/todos
//    @GetMapping(value = "alumno/leer/todos")
//    public ResponseEntity<?> obtenerTodosLosAlumnos() {
//        return ResponseEntity.ok(clienteRepository.findAll());
//    }
//
//    //READ -------------------------
//    //http://localhost:8080/alumno/actualizar/12345
//    @GetMapping(value = "alumno/actualizar/{dni}")
//    public ResponseEntity<?> actualizarNombrePorDNI(@PathVariable(name = "dni") final Long dni) {
//        Alumno alumno = clienteRepository.getReferenceById(dni);
//        alumno.setNombre("NombreNuevo");
//        return ResponseEntity.ok(clienteRepository.save(alumno));
//    }
}
