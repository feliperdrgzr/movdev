package com.mobdev.test.movdev.model.service;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class UserDetailServiceImpl implements UserDetailsService {

    /**
     * Metodo que devuelve de manera mockeada el usuario en la aplicación.
     *
     * Pero se podria buscar eventualmente los usuarios en la BD
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return new User("movdev", "1234", new ArrayList<>());
    }
}
