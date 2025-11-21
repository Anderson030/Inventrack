package com.inventory.Inventrack.web.controller;

import com.inventory.Inventrack.domain.entity.Category;
import com.inventory.Inventrack.domain.entity.Category;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/category")
public class CategoryController {
    private final GenericService<Category, Long> genericService;

    public CategoryController(GenericService<Category, Long> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public Category save(@RequestBody Category entity) {
        genericService.save(entity);
        return entity;
    }
    @GetMapping
    public List<Category> findAll(){
        return genericService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Category> findById(@PathVariable Long id) {
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
