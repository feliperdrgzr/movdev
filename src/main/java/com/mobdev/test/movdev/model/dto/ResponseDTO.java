package com.mobdev.test.movdev.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {
    private int id;
    private String name;
    private String status;
    private String species;
    private String type;
    private int episode_count;
    private Ubicacion origin;
    private Ubicacion location;

    public ResponseDTO(Character info) {
        if (info == null) {
            return;
        }
        this.id = info.getId();
        this.name = info.getName();
        this.status = info.getStatus();
        this.species = info.getSpecies();
        this.type = info.getType();
        this.episode_count = info.getEpisode_count();
    }
}
