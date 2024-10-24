package com.teteu.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teteu.Curso.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
