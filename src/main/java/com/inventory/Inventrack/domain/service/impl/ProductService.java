package com.inventory.Inventrack.domain.service.impl;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.repo.implementRepository.ProductRepositoryExtendsAbstractCustomized;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements ProductRepositoryExtendsAbstractCustomized {

    private final ProductRepositoryExtendsAbstractCustomized productRepository;

    protected ProductService(ProductRepositoryExtendsAbstractCustomized productRepository){
        super(productRepository);
        this.productRepository = productRepository;
    }


}
