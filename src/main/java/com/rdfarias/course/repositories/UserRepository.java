package com.rdfarias.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rdfarias.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
