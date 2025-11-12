package com.inventory.Inventrack.domain.service;

import com.inventory.Inventrack.domain.entity.Purchase;
import com.inventory.Inventrack.domain.repo.ProductRepo;
import com.inventory.Inventrack.domain.repo.PurchaseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PurchaseService {
    @Autowired
    private PurchaseRepo purchaseRepo;

    public Purchase save(Purchase purchase){
        return purchaseRepo.save(purchase);
    }

    public Optional<Purchase> findById(Long id){
        return purchaseRepo.findById(id);
    }

    public List<Purchase> findAll(){
        return purchaseRepo.findAll();
    }

    public void delete(Long id){
        purchaseRepo.deleteById(id);
    }
}
