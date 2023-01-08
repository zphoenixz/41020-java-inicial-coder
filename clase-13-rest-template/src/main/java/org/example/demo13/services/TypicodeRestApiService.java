package org.example.demo13.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.demo13.models.requests.ClienteRequest;
import org.example.demo13.models.schemas.Cliente;
import org.example.demo13.models.schemas.UserTypicode;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class TypicodeRestApiService {

    public List<String> getUsers() throws JsonProcessingException {
        RestTemplate restTemplate = new RestTemplate();
        final String url = "https://jsonplaceholder.typicode.com/users";
        List<String> response = restTemplate.getForObject(url, List.class);
        return response;
    }
}
