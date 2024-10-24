package com.teteu.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teteu.Curso.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
