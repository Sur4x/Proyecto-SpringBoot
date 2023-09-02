package edu.curso.spring1.primerospasos1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimerosPasos1Application {

	private static Logger log = LoggerFactory.getLogger(PrimerosPasos1Application.class);
	
	public static void main(String[] args) {
		
		SpringApplication.run(PrimerosPasos1Application.class, args);
		
		log.info("Hola Mundo");
		log.debug("Iniciando la aplicación...");
		log.info("Termino de cargar Spring Boot");
		log.warn("Este es un mensaje de advertencia para probar.");
		log.error("Este es un mensaje de error para probar.");

	}

}
