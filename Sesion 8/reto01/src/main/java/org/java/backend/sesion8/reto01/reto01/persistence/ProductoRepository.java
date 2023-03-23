package org.java.backend.sesion8.reto01.reto01.persistence;

import org.java.backend.sesion8.reto01.reto01.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
