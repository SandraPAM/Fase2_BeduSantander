package org.java.backend.sesion8.reto01.reto01.runners;

import org.java.backend.sesion8.reto01.reto01.model.Etapa;
import org.java.backend.sesion8.reto01.reto01.persistence.EtapaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class EtapasVentaRunner implements CommandLineRunner {

    private final EtapaRepository etapaRepository;

    @Autowired
    public EtapasVentaRunner(EtapaRepository etapaRepository){
        this.etapaRepository = etapaRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<Etapa> etapas = new ArrayList<>();
        etapas.add(crearEtapa("En espera", 0));
        etapas.add(crearEtapa("Reunión de exploración", 1));
        etapas.add(crearEtapa("Metas establecidas", 2));
        etapas.add(crearEtapa("Plan de acción presentado", 3));
        etapas.add(crearEtapa("Contrato firmado", 4));
        etapas.add(crearEtapa("Venta ganda", 5));
        etapas.add(crearEtapa("Venta perdida", 6));



        try {
            etapaRepository.saveAll(etapas);
        } catch (Exception e){
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("Catálogo creado!!!");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        }
    }

    private Etapa crearEtapa(String nombre, Integer orden){
        Etapa etapa = new Etapa();
        etapa.setNombre(nombre);
        etapa.setOrden(orden);

        return etapa;
    }

}
