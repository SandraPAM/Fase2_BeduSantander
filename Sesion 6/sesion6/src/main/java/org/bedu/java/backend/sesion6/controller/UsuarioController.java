package org.bedu.java.backend.sesion6.controller;

import org.bedu.java.backend.sesion6.model.Direccion;
import org.bedu.java.backend.sesion6.model.Usuario;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/usuario")
public class UsuarioController {



    @PostMapping
    public String creaUsuario(@RequestBody Usuario usuario){
        System.out.println("creaUsuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellidos());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        return "Usuario creado!!!";

    }

    @PostMapping("/{id}")
    public String creaUsuarioParams(@RequestBody Usuario usuario, @PathVariable("id") long id){
        System.out.println("creaUsuarioParams");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellidos());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        return "Usuario " + id + " creado!!!";

    }

    @PostMapping("/reto01")
    public @ResponseBody String creaUsuarioQueryParams(@RequestBody Usuario usuario,
                                                       @RequestParam("id") long id,
                                                       @RequestParam("rol") String rol){
        System.out.println("creaUsuarioQueryParams");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellidos());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());
        System.out.println("Rol: " + rol);

        return "Usuario " + id + " creado!!!";

    }

    //Ejemplo 02 - Complement
    @PostMapping("ejemplo02")
    public ResponseEntity<Usuario> creaUsuarioE2(@RequestBody Usuario usuario){
        System.out.println("creaUsuario");
        System.out.println("Nombre: " + usuario.getNombre());
        System.out.println("Apellido: " + usuario.getApellidos());
        System.out.println("Correo: " + usuario.getCorreoElectronico());
        System.out.println("Contraseña: " + usuario.getPassword());

        //Ejemplo 02
        Direccion direccion = new Direccion();
        direccion.setCalle("Córdoba");
        direccion.setNumero("56");
        direccion.setCodigoPostal("06700");

        usuario.setDireccion(direccion);

        return ResponseEntity.status(HttpStatus.CREATED).body(usuario);

    }
}
