package com.rdfarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdfarias.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
