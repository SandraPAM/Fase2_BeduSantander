package org.bedu.java.backend.Sesion5.service;

import jakarta.annotation.PostConstruct;
import org.bedu.java.backend.Sesion5.model.SaludoProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaludoServiceProperties {

    private final SaludoProperties saludoProperties;

    @Autowired
    public SaludoServiceProperties(SaludoProperties saludoProperties) {
        this.saludoProperties = saludoProperties;
    }

    @PostConstruct
    public void init(){
        saludoProperties.setNombre("SANDRA");
    }


    public String saluda(){
        return "Ejemplo 03: Hola " + saludoProperties.getNombre();
    }


}
