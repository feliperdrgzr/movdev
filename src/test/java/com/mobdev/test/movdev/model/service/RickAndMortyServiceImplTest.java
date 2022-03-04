package com.mobdev.test.movdev.model.service;

import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ContextConfiguration(classes = {RickAndMortyServiceImpl.class})
@ExtendWith(SpringExtension.class)
class RickAndMortyServiceImplTest {
    @Autowired
    private RickAndMortyServiceImpl rickAndMortyServiceImpl;

    @Test
    void testGetInfo() {
        assertNull(this.rickAndMortyServiceImpl.getResponseDTO(1));
    }
}

