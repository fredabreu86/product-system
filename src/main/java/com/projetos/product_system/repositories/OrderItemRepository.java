package com.projetos.product_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetos.product_system.entities.OrderItem;
import com.projetos.product_system.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK>{

}
