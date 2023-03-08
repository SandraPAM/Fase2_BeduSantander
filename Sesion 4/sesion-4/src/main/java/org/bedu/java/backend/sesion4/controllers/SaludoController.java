package org.bedu.java.backend.sesion4.controllers;

import org.bedu.java.backend.sesion4.model.Saludo;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;

@RestController
public class SaludoController {

    @GetMapping("/saludo")
    public Saludo saluda(){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo!!!");
        return saludo;
    }

    @GetMapping("/saludo/{name}")
    public @ResponseBody Saludo saludoName(@PathVariable String name){
        Saludo saludo = new Saludo();
        saludo.setMensaje("Hola Mundo!!!");
        saludo.setNombre(name);
        return saludo;
    }

    @PostMapping("/saludo")
    public Saludo saludoPost(@RequestBody Saludo saludo){
        return saludo;
    }

    @PutMapping("/saludo")
    public Saludo saludoPut(@RequestBody Saludo saludo){
        Saludo saludo1 = new Saludo();

        saludo1.setNombre(saludo.getNombre());
        saludo1.setMensaje(saludo.getMensaje());
        saludo1.setEdad(saludo.getEdad());
        saludo1.setFechaNacimiento(saludo.getFechaNacimiento().plusDays(1));

        return saludo1;

    }
}
