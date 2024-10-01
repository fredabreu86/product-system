package com.projetos.product_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.product_system.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
