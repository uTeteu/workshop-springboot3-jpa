package com.teteu.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teteu.Curso.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}