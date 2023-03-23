package org.bedu.java.backend.session4.Postwork.persistance;

import org.bedu.java.backend.session4.Postwork.model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, Long> {
}
