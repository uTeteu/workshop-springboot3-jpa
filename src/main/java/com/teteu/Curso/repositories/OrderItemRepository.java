package com.teteu.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teteu.Curso.entities.OrderItem;
import com.teteu.Curso.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
