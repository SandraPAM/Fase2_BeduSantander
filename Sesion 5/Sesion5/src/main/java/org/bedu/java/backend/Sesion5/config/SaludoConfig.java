package org.bedu.java.backend.Sesion5.config;

import org.bedu.java.backend.Sesion5.model.Saludo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SaludoConfig {


    @Bean
    public Saludo saludo(){
        return new Saludo("Ejemplo 01: Pame");
    }
}
