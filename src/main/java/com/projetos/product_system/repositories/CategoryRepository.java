package com.projetos.product_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.product_system.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
