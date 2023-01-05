package org.example.demo13.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.demo13.models.schemas.Cliente;
import org.example.demo13.models.requests.ClienteRequest;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ClienteRestApiService {

    public Cliente postCliente(ClienteRequest clienteRequest) throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
//        final String url = "https://jsonplaceholder.typicode.com/users";
        final String url = "http://localhost:8081/cliente";
        String response = restTemplate.postForObject(url, clienteRequest, String.class);

        final ObjectMapper customMapper = new ObjectMapper();
        final Cliente clienteResponse = customMapper.readValue(response, Cliente.class);

        return clienteResponse;
    }

}
