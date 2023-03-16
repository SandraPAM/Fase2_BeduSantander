package org.bedu.java.backend.session4.Postwork.service;

import org.bedu.java.backend.session4.Postwork.model.Persona;
import org.bedu.java.backend.session4.Postwork.persistance.AgendaMemoryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class AgendaService {

    private final ValidadorTelefono validadorTelefono;
    private final AgendaMemoryDao agendaMemoryDao;

    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, AgendaMemoryDao agendaDao){
        this.validadorTelefono = validadorTelefono;
        this.agendaMemoryDao = agendaDao;
    }

    public Persona guardaPersona(Persona persona){

        String telefono = persona.getTelefono();

        if(!validadorTelefono.isValido(telefono) & validadorTelefono.isValidTenDigits(telefono)) {
            return null;
        }

        telefono = validadorTelefono.limpiaNumero(telefono);

        persona.setTelefono(telefono);

        return agendaMemoryDao.guardaPersona(persona);
    }

    public Set<Persona> getPersonas(){
        return agendaMemoryDao.getPersonas();
    }
}
