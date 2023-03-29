package org.bedu.javase2.ejemplo.ejemplo1.repositories;

import org.bedu.javase2.ejemplo.ejemplo1.modules.Equipo;
import org.springframework.data.repository.CrudRepository;

public interface EquipoRepository extends CrudRepository<Equipo, Long> {
}
