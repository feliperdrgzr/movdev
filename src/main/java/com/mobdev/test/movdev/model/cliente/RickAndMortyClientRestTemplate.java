package com.mobdev.test.movdev.model.cliente;

import com.mobdev.test.movdev.model.dto.Character;
import com.mobdev.test.movdev.model.dto.Ubicacion;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class RickAndMortyClientRestTemplate implements RickAndMortyClient {

    @Value("${url.base.api.rickandmorty}")
    private String urlBase;

    private RestTemplate restTemplate;

    @Override
    public Character getCharacter(Integer id) {
        return this.restTemplate.getForObject(urlBase + "/character/{id}", Character.class, id);
    }

    public RickAndMortyClientRestTemplate() {
        RestTemplateBuilder builder = new RestTemplateBuilder();
        this.restTemplate = builder.build();
    }

    @Override
    public Ubicacion getLocationByUrl(String url) {
        return this.restTemplate.getForObject(url, Ubicacion.class);
    }

}
