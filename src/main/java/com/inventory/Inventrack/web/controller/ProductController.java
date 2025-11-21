package com.inventory.Inventrack.web.controller;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController{

    private final GenericService<Product, Long> genericService;

    public ProductController(GenericService<Product, Long> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public Product save(@RequestBody Product entity) {
        genericService.save(entity);
        return entity;
    }
    @GetMapping
    public List<Product> findAll(){
        return genericService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Product> findById(@PathVariable Long id) {
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
    
//    @GetMapping("sku/{sku}")
//    public Optional<Product> findBySku(@PathVariable String sku){
//        return productService.findBySku(sku);
//    }
//    @DeleteMapping("sku/{sku}")
//    public void deleteBySku(@PathVariable String sku){
//        productService.deleteBySku(sku);
//    }
}
