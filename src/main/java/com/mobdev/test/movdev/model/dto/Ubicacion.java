package com.mobdev.test.movdev.model.dto;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Ubicacion {
    private String name;
    private String url;
    private String dimension;
    private ArrayList<String> residents;
}
