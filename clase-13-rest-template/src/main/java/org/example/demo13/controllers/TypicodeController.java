package org.example.demo13.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.example.demo13.models.requests.ClienteRequest;
import org.example.demo13.services.ClienteRestApiService;
import org.example.demo13.services.TypicodeRestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/typicode")
public class TypicodeController {
    @Autowired
    TypicodeRestApiService typicodeRestApiService;
    @GetMapping(value = "users", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity<?> getUsers() throws JsonProcessingException {
        return ResponseEntity.ok(typicodeRestApiService.getUsers());
    }
}
