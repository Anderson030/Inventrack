package com.inventory.Inventrack.domain.service.interfaces.customized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;

import java.util.Optional;

public interface ProductService extends GenericService<Product, Long> {

    Optional<Product> findBySku(String sku);
    void deleteBySku(String sku);
}
