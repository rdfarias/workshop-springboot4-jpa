package com.rdfarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdfarias.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
