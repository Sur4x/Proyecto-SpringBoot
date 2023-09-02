package edu.curso.spring1.primerospasos1.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import edu.curso.spring1.primerospasos1.bo.Producto;
import edu.curso.spring1.primerospasos1.rest.dto.ProductoDTO;
import edu.curso.spring1.primerospasos1.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductosRestController {
	
	@Autowired
	private ProductoService productoService; 
	
	@GetMapping("/{id}")
	public ProductoDTO buscarProductoPorId (@PathVariable Long Id) {
		
		Producto producto = productoService.buscarProductoPorId(Id);
		return new ProductoDTO(producto);
		
	}
	
	@GetMapping
	public List<ProductoDTO> buscarProductos(){
		List<Producto> productos= productoService.recuperarProductos();
		List<ProductoDTO> productosDTO = new ArrayList<ProductoDTO>();
		for (Producto p: productos) {
			productosDTO.add(new ProductoDTO(p));
		}
		return productosDTO;
	}
	
}
