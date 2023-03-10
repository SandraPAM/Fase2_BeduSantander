package org.bedu.java.backend.Sesion5.model;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value = "saludoComponent, otroSaludo")
public class SaludoComponent implements FactoryBean<Object> {

    private final String name;

    public SaludoComponent() {
        this.name = "Pame";

        System.out.println("Creando una instancia de SaludoComponent");
    }

    public String getName() {
        return name;
    }

    @Override
    public Object getObject() throws Exception {
        return new SaludoComponent();
    }

    @Override
    public Class<?> getObjectType() {
        return SaludoComponent.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
