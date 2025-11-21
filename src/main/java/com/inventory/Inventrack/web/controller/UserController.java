package com.inventory.Inventrack.web.controller;

import com.inventory.Inventrack.domain.entity.User;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/User")
public class UserController{
    private final GenericService<User, Long> genericService;

    public UserController(GenericService<User, Long> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public User save(@RequestBody User entity) {
        genericService.save(entity);
        return entity;
    }
    @GetMapping
    public List<User> findAll(){
        return genericService.findAll();
    }

    @GetMapping("{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return genericService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable Long id){
        genericService.deleteById(id);
    }

    @GetMapping("exists/{id}")
    public boolean existById(@PathVariable Long id){
        return genericService.existsById(id);
    }
}
