package edu.curso.spring1.primerospasos1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edu.curso.spring1.primerospasos1.bo.Producto;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {

}
