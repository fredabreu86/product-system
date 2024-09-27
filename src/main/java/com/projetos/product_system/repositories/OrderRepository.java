package com.projetos.product_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.product_system.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
