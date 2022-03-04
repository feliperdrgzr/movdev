package com.mobdev.test.movdev.model.dto;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Character {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_count;
    private Ubicacion origin;
    private Ubicacion location;
}
