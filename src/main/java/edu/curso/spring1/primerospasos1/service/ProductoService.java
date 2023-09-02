package edu.curso.spring1.primerospasos1.service;

import java.util.List;

import edu.curso.spring1.primerospasos1.bo.Producto;

public interface ProductoService {

	Long altaDeNuevoProducto(Producto producto);

	void actualizarProducto (Producto producto);
	Producto buscarProductoPorId(Long id);
	List <Producto> recuperarProductos();
	void borrarProducto(Long id);
	
}