package com.mobdev.test.movdev.model.cliente;

import com.mobdev.test.movdev.model.dto.Character;
import com.mobdev.test.movdev.model.dto.Ubicacion;

public interface RickAndMortyClient {

    Character getCharacter(Integer id);

    Ubicacion getLocationByUrl(String url);

}
