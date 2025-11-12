package com.inventory.Inventrack.domain.service;

import com.inventory.Inventrack.domain.entity.StockOperation;
import com.inventory.Inventrack.domain.repo.StockOperationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StockOperationService {

    @Autowired
    private StockOperationRepo stockOperationRepo;

    public StockOperation save(StockOperation stockOperation){
        return stockOperationRepo.save(stockOperation);
    }

    public Optional<StockOperation> findById(Long id){
        return stockOperationRepo.findById(id);
    }

    public List<StockOperation> findAll(){
        return stockOperationRepo.findAll();
    }

    public void delete(Long id){
        stockOperationRepo.deleteById(id);
    }
}
