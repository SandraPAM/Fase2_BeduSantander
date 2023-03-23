package org.bedu.java.backend.session4.Postwork.service;

import org.bedu.java.backend.session4.Postwork.model.Persona;
import org.bedu.java.backend.session4.Postwork.persistance.AgendaMemoryDao;
import org.bedu.java.backend.session4.Postwork.persistance.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
public class AgendaService {

    private final ValidadorTelefono validadorTelefono;
    //private final AgendaMemoryDao agendaMemoryDao;
    private final PersonaRepository personaRepository;

    /*
    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, AgendaMemoryDao agendaDao){
        this.validadorTelefono = validadorTelefono;
        this.agendaMemoryDao = agendaDao;
    }
     */
    @Autowired
    public AgendaService(ValidadorTelefono validadorTelefono, PersonaRepository personaRepository){
        this.validadorTelefono = validadorTelefono;
        this.personaRepository = personaRepository;
    }

    public Persona guardaPersona(Persona persona){


        String telefono = persona.getTelefono();

        /*
        if(!validadorTelefono.isValido(telefono) & validadorTelefono.isValidTenDigits(telefono)) {
            return null;
        }
         */

        telefono = validadorTelefono.limpiaNumero(telefono);

        persona.setTelefono(telefono);

        return personaRepository.save(persona);
    }

    /*
    public Set<Persona> getPersonas(){
        return agendaMemoryDao.getPersonas();
    }
     */
    public List<Persona> getPersonas(){
        return personaRepository.findAll(Sort.by("nombre"));
    }
}
