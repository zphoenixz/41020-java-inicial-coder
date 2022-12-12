package org.example.demo2;

import org.example.demo2.Repositories.ClienteRepository;
import org.example.demo2.Repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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
        Domicilio domilicioCreado = domicilioRepository.save(domicilio);

        return ResponseEntity.ok(domilicioCreado);

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

    //READ -------------------------
    //http://localhost:8080/domicilio/leer/1
    @GetMapping(value = "leer/{id}")
    public ResponseEntity<?> obtenerDomicilioPorID(@PathVariable(name = "id") final Long id) {
        Domicilio domicilioBuscado = domicilioRepository.getReferenceById(id);
        return ResponseEntity.ok(domicilioBuscado);
    }
}
