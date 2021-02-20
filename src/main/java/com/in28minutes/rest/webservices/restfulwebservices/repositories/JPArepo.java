package com.in28minutes.rest.webservices.restfulwebservices.repositories;

import com.in28minutes.rest.webservices.restfulwebservices.POJOS.Todo;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JPArepo extends JpaRepository<Todo,Integer> {
    
}
