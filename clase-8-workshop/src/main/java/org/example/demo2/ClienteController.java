package org.example.demo;


import org.example.demo.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    //CREATE -------------------------
    //http://localhost:8080/cliente/crear1
    @GetMapping(value = "crear1")
    public ResponseEntity<?> crearCliente() {

        Cliente nuevoCliente = new Cliente(
                "Roger",
                "Mendez",
                11111
        );
        return ResponseEntity.ok(clienteRepository.save(nuevoCliente));
    }

    //READ -------------------------
    //http://localhost:8080/cliente/1
    @GetMapping(value = "alumno/leer/{id}")
    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
        return ResponseEntity.ok(clienteRepository.getReferenceById(id));
    }
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
