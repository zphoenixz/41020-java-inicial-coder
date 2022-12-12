package org.example.demo2;


import org.example.demo2.Repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
    //http://localhost:8080/cliente/leer/1
    @GetMapping(value = "leer/{id}")
    public ResponseEntity<?> obtenerClientePorID(@PathVariable(name = "id") final Long id) {
        Cliente clienteBuscado = clienteRepository.getReferenceById(id);
        return ResponseEntity.ok(clienteBuscado);
    }
}
