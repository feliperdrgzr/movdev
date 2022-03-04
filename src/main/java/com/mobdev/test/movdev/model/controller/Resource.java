package com.mobdev.test.movdev.model.controller;

import com.mobdev.test.movdev.model.dto.ResponseDTO;
import com.mobdev.test.movdev.model.service.RickAndMortyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/*")
public class Resource {

    @Autowired
    RickAndMortyService rickAndMortyService;

    @GetMapping("/character/{id}")
    public ResponseEntity<ResponseDTO> info(@PathVariable Integer id){
        ResponseDTO info = rickAndMortyService.getResponseDTO(id);
        return ResponseEntity.ok(info);
    }

}
