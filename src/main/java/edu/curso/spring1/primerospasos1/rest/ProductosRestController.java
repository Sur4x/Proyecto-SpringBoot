package edu.curso.spring1.primerospasos1.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.spring1.primerospasos1.service.ProductoService;

@RestController
public class ProductosRestController {
	
	@Autowired
	private ProductoService productoService; 
	
	
}
