package com.inventory.Inventrack.domain.service.interfaces.customized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.repository.JPAImpl.interfaceCostumized.ProductRepository;

import java.util.Optional;

public interface ProductService {

    Optional<Product> findBysku(String sku);
    void deleteBysku(String sku);
}
