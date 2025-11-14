package com.inventory.Inventrack.web.controller;

import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


public class ControllerGeneric<T, ID>{

    private final GenericService<T, ID> genericService;

    public ControllerGeneric(GenericService<T, ID> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public T save(@RequestBody T entity) {
        genericService.save(entity);
        return entity;
    }
    @GetMapping
    public List<T> findAll(){
        return genericService.findAll();
    }

    @GetMapping("{id}")
    public Optional<T> findById(@PathVariable ID id) {
        return genericService.findById(id);
    }

    @DeleteMapping("{id}")
    public void deleteById(@PathVariable ID id){
        genericService.deleteByID(id);
    }

    @PostMapping
    public boolean existById(@PathVariable ID id){
        return genericService.existsById(id);
    }
}
