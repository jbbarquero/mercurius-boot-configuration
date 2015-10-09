package com.malsolo.mercurius.boot.configuration.jomo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JomoService {

    private final JomoConfiguration configuration;

    @Autowired
    public JomoService(JomoConfiguration configuration) {
        this.configuration = configuration;
    }

    public String doStuff() {
        return configuration.toString();
    }

}
