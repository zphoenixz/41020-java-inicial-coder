package org.example.demo3.controllers;


import org.example.demo3.Repositories.ClienteRepository;
import org.example.demo3.entities.Cliente;
import org.example.demo3.requests.ClienteRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;

    //CREATE -------------------------
    //http://localhost:8080/cliente
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> crearCliente(@RequestBody ClienteRequest clienteRequest) {
        Cliente clienteAGuardar = new Cliente(
                clienteRequest.getNombre(),
                clienteRequest.getApellido(),
                clienteRequest.getDni()
        );


        return ResponseEntity.ok(clienteRepository.save(clienteAGuardar));
    }

    //READ -------------------------
    //http://localhost:8080/cliente/leer/1
    @GetMapping(value = "leer/{id}")
    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
        Cliente clienteBuscado = clienteRepository.getReferenceById(id);
        return ResponseEntity.ok(clienteBuscado);
    }
}
