package org.example.demo13.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.demo13.models.requests.ClienteRequest;
import org.example.demo13.services.ClienteRestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cliente")
public class ClienteControllerNico {

    @Autowired
    ClienteRestApiService clienteRestApiService;
    //CREATE -------------------------
    //http://localhost:8080/cliente
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> crearCliente(@RequestBody ClienteRequest clienteRequest) throws JsonProcessingException {

        return ResponseEntity.ok(clienteRestApiService.postCliente(clienteRequest));
    }

//    //READ -------------------------
//    //http://localhost:8080/cliente/leer/1
//    @GetMapping(value = "leer/{id}")
//    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
//        Cliente clienteBuscado = clienteRepository.getReferenceById(id);
//        return ResponseEntity.ok(clienteBuscado);
//    }
//
//    //READ -------------------------
//    //http://localhost:8080/cliente/leer/1
//    @DeleteMapping(value = "leer/{id}")
//    public ResponseEntity<?> borrarClientePorID(@PathVariable(name = "id") final Long id) {
//        clienteRepository.deleteById(id);
//        return ResponseEntity.ok("Cliente Borrado");
//    }
//
//    //Put -------------------------
//    //http://localhost:8080/cliente/leer/1
//    @PutMapping(value = "leer/{id}")
//    public ResponseEntity<?> actualizarClientePorID(@PathVariable(name = "id") final Long id) {
//        Cliente clienteBuscado = clienteRepository.getReferenceById(id);
//        return ResponseEntity.ok(clienteBuscado);
//    }

}
