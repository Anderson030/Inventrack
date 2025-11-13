package com.inventory.Inventrack.domain.service;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService{

    @Autowired
    private ProductRepo productRepo;

    public Product save(Product product){
        return  productRepo.save(product);
    }

    public Optional<Product> findById(Long id){
        return productRepo.findById(id);
    }

    public Optional<Product> findBySku(String sku){
        return productRepo.findBySku(sku);
    }

    public List<Product> findAll(){
        return productRepo.findAll();
    }
    public void delete(Long id){
        productRepo.deleteById(id);
    }
    public void deleteBySku(String sku){
        productRepo.deleteBySku(sku);
    }

}
