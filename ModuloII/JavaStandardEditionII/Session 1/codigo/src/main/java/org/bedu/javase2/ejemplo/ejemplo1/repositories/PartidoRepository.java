package org.bedu.javase2.ejemplo.ejemplo1.repositories;

import org.bedu.javase2.ejemplo.ejemplo1.modules.Partido;
import org.springframework.data.repository.CrudRepository;

public interface PartidoRepository extends CrudRepository<Partido, Long> {
}
