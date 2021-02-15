package com.manadev.restful.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.manadev.restful.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
