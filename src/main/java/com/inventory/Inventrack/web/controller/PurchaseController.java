package com.inventory.Inventrack.web.controller;

import com.inventory.Inventrack.domain.entity.Purchase;
import com.inventory.Inventrack.domain.entity.Purchase;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/purchase")
public class PurchaseController{
    private final GenericService<Purchase, Long> genericService;

    public PurchaseController(GenericService<Purchase, Long> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public Purchase save(@RequestBody Purchase entity) {
        genericService.save(entity);
        return entity;
    }
    @GetMapping
    public List<Purchase> findAll(){
        return genericService.findAll();
    }

    @GetMapping("{id}")
    public Optional<Purchase> findById(@PathVariable Long id) {
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
