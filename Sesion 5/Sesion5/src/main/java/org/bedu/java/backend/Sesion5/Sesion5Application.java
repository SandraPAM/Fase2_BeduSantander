package org.bedu.java.backend.Sesion5;

import org.bedu.java.backend.Sesion5.model.Saludo;
import org.bedu.java.backend.Sesion5.model.SaludoProperties;
import org.bedu.java.backend.Sesion5.service.SaludoService;
import org.bedu.java.backend.Sesion5.service.SaludoServiceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Sesion5Application implements CommandLineRunner {

	//@Autowired
	//Poco seguro y lento colocar aquí @Autowired
	//private Saludo saludo;

   //Segunda forma
    /*
	private Saludo saludo;
	@Autowired
	public void setSaludo(Saludo saludo){
		this.saludo = saludo;
	}
     */

	//Ejemplo1
	private final Saludo saludo;

	//Ejemplo2
	private final SaludoService saludoService;

	private final SaludoServiceProperties saludoServiceProperties;

	@Autowired
	public Sesion5Application(Saludo saludo, SaludoService saludoService, SaludoServiceProperties saludoServiceProperties) {
		this.saludo = saludo;
		this.saludoService = saludoService;
		this.saludoServiceProperties = saludoServiceProperties;
	}

	public static void main(String[] args) {
		SpringApplication.run(Sesion5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(saludo.getNombre());
		System.out.println(saludoService.saluda());
		System.out.println(saludoServiceProperties.saluda());
	}
}
