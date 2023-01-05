package org.example.demo10.controllers;

import org.example.demo10.Repositories.ClienteRepository;
import org.example.demo10.Repositories.DomicilioRepository;
import org.example.demo10.entities.Cliente;
import org.example.demo10.entities.Domicilio;
import org.example.demo10.requests.DomicilioRequest;
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
@RequestMapping("/domicilio")
public class DomicilioController {
    @Autowired
    private DomicilioRepository domicilioRepository;
    @Autowired
    private ClienteRepository clienteRepository;

    //CREATE -------------------------
    //http://localhost:8080/domicilio
    @PostMapping(consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> crearDomicilio1(@RequestBody DomicilioRequest domicilioRequest) {
        Cliente cliente = clienteRepository.getReferenceById(domicilioRequest.getIdCliente());

        Domicilio domicilio = new Domicilio(
                domicilioRequest.getCalle(),
                domicilioRequest.getNumero(),
                domicilioRequest.getPiso(),
                domicilioRequest.getDepartamento(),
                domicilioRequest.getCp(),
                domicilioRequest.getLocalidad(),
                domicilioRequest.getProvincia(),
                cliente
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

    /*TODO
        Diseñen URI para obtener el mis datos de usuario de la app XYZ,
        usando mi DNI
        XYZ.COM/usuario/{usuarioDNI}
      TODO
        Dame la pagina 3 de los usuarios
        XYZ.COM/usuario?pag=3&orden=asc

      TODO
        Dame todas las transferencias del dia de hoy para mi DNI
        XYZ.COM/usuario/{DNI}/transferencias?fecha=14122022

      TODO
        Dame la transferencia con el codigo 123 que es de mi DNI
        Correcto
        XYZ.COM/usuario/{DNI}/transferencias/{123}
        Equivalente, no recomendado pero valido
        XYZ.COM/usuario/{DNI}/transferencias?cod={123}

     */
}
