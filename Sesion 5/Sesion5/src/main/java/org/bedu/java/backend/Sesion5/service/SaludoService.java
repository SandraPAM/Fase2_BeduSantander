package org.bedu.java.backend.Sesion5.service;

import org.bedu.java.backend.Sesion5.model.Saludo;
import org.bedu.java.backend.Sesion5.model.SaludoComponent;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

@Service
public class SaludoService implements InitializingBean {

    private final SaludoComponent saludoComponent;
    private final SaludoComponent otroSaludo;

    @Autowired
    public SaludoService(SaludoComponent saludoComponent, SaludoComponent otroSaludo) {
        this.saludoComponent = saludoComponent;
        this.otroSaludo = otroSaludo;

        System.out.println(otroSaludo == saludoComponent);
    }

    public String saluda(){
        return "Ejemplo 02: Hola " + saludoComponent.getName();
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        Assert.notNull(this.saludoComponent, "Saludo Component");
        Assert.notNull(this.otroSaludo, "Ooootro Saludo");
    }
}
