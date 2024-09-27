package com.projetos.product_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.product_system.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
