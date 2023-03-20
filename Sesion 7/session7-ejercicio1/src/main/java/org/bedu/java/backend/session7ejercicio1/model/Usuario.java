package org.bedu.java.backend.session7ejercicio1.model;

import jakarta.validation.constraints.*;

public class Usuario {
    @NotBlank(message = ": El nombre de usuario es un campo obligatorio.")
    private String nombre;
    @Email(message = ": El correo electrónico tiene un formato incorrecto.")
    private String email;
    //@Min(value = 8, message = ": El nombre de usuario debe tener al menos 8 caracteres.")
    //@Max(value = 20, message = ": El nombre de usuario puede tener hasta 20 caracteres.")
    @Size(min = 8, max = 20, message = "el nombre de usuario debe tener entre 8 y 20 caracteres.")
    private String username;
    @NotBlank(message = ": El rol del usuario es un campo obligatorio.")
    private String rol;
    @NotBlank(message = ": La contraseña es un campo obligatorio")
    private String password;
    @Pattern(regexp = "^(\\d{2,4}[- .]?){2}\\d{4}$",message = ": El teléfono debe tener un formato de ##-####-####")
    private String telefono;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
