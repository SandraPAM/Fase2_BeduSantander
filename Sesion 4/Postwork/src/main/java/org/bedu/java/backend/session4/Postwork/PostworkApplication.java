package org.bedu.java.backend.session4.Postwork;

import org.bedu.java.backend.session4.Postwork.model.Persona;
import org.bedu.java.backend.session4.Postwork.service.FormateadorTelefono;
import org.bedu.java.backend.session4.Postwork.service.ValidadorTelefono;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class PostworkApplication{

	public static void main(String[] args) {
		SpringApplication.run(PostworkApplication.class, args);
	}

}
