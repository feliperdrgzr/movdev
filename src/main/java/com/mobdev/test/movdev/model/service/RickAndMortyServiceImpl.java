package com.mobdev.test.movdev.model.service;

import com.mobdev.test.movdev.model.dto.Character;
import com.mobdev.test.movdev.model.dto.Ubicacion;
import com.mobdev.test.movdev.model.cliente.RickAndMortyClient;
import com.mobdev.test.movdev.model.dto.ResponseDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RickAndMortyServiceImpl implements RickAndMortyService{

    @Autowired
    RickAndMortyClient rickAndMortyClient;


    @Override
    public ResponseDTO getResponseDTO(Integer id) {
        Character character = rickAndMortyClient.getCharacter(id);
        ResponseDTO responseDTO = new ResponseDTO(character);
        if (character != null) {
            if (character.getOrigin() != null) {
                String urlOrigen = character.getOrigin().getUrl();
                if (!urlOrigen.isEmpty()) {
                    Ubicacion origin = rickAndMortyClient.getLocationByUrl(urlOrigen);
                    responseDTO.setOrigin(origin);
                }
            }
            if (character.getLocation() != null) {
                String urlLocation = character.getLocation().getUrl();
                if (!urlLocation.isEmpty()) {
                    Ubicacion location = rickAndMortyClient.getLocationByUrl(urlLocation);
                    responseDTO.setLocation(location);
                }
            }
        }
        return responseDTO;
    }

}
