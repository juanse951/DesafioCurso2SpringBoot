package com.aluracursos.desafio2;

import com.aluracursos.desafio2.principal.Principal;
import com.aluracursos.desafio2.repository.DatosCantanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Desafio2Application implements CommandLineRunner {

	@Autowired
	private DatosCantanteRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(Desafio2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(repository);
		principal.muestraElMenu();
	}
}
