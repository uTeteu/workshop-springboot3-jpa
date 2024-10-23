package com.teteu.Curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.teteu.Curso.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
