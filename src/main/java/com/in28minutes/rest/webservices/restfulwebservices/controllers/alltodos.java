package com.in28minutes.rest.webservices.restfulwebservices.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

import com.in28minutes.rest.webservices.restfulwebservices.POJOS.Todo;
import com.in28minutes.rest.webservices.restfulwebservices.Services.allUsersService;
import com.in28minutes.rest.webservices.restfulwebservices.repositories.JPArepo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;

@CrossOrigin(origins="http://localhost:4200")
@RestController
public class alltodos {

    @Autowired
    private allUsersService aus;
    @Autowired
    private JPArepo jpaRepo;
    
    @GetMapping(value = "jpa/alltodos")
    public List<Todo> getAllUsersTodo()
    {
        // return aus.getAllUsers();
        return jpaRepo.findAll();
    }
    @DeleteMapping(value = "/jpa/todos/delete/{id}")
    public ResponseEntity<Void> deleteById(@PathVariable int id)
    {
        jpaRepo.deleteById(id);
        return ResponseEntity.noContent().build();
        // Todo deleTodo=aus.deleteById(id);
        // if(deleTodo!=null)
        // {
        //     return ResponseEntity.noContent().build();
        // }
        // else
        // {
        //     return ResponseEntity.notFound().build();
        // }
    }
    @GetMapping(value="/jpa/todos/getbyid/{id}")
    public Todo getById(@PathVariable int id)
    {
        // return aus.findById(id);
        return jpaRepo.findById(id).get();
    }

    @PutMapping("/jpa/todos/updatetodo/{id}")
    public ResponseEntity<Todo> updateTodo(@PathVariable int id,@RequestBody Todo todo)
    {
        // Todo todoUpdated=aus.save(todo);
        Todo todoUpdated=jpaRepo.save(todo);
        return new ResponseEntity<Todo>(todoUpdated,HttpStatus.OK);
    }
    @PostMapping("/jpa/todos/addtodo")
    public ResponseEntity<Void> addTodo(@RequestBody Todo todo)
    {
        // Todo added=aus.save(todo);
        todo.setUsername("raghu");
        Todo added=jpaRepo.save(todo);
        URI uri= ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(added.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
