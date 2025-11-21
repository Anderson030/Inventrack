package com.inventory.Inventrack.web.controller;

import com.inventory.Inventrack.domain.entity.StockOperation;
import com.inventory.Inventrack.domain.entity.StockOperation;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/stockOperation")
public class StockOperationController{
    private final GenericService<StockOperation, Long> genericService;

    public StockOperationController(GenericService<StockOperation, Long> genericService) {
        this.genericService = genericService;
    }

    @PostMapping
    public StockOperation save(@RequestBody StockOperation entity) {
        genericService.save(entity);
        return entity;
    }
    @GetMapping
    public List<StockOperation> findAll(){
        return genericService.findAll();
    }

    @GetMapping("{id}")
    public Optional<StockOperation> findById(@PathVariable Long id) {
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
