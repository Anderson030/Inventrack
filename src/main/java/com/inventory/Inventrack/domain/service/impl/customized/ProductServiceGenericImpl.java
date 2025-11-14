package com.inventory.Inventrack.domain.service.impl.customized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.repository.GenericRepository;
import com.inventory.Inventrack.domain.repository.JPAImpl.interfaceCostumized.ProductRepository;
import com.inventory.Inventrack.domain.service.impl.ServiceGenericImpl;
import com.inventory.Inventrack.domain.service.interfaces.customized.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductServiceGenericImpl implements ProductService {

    private final ProductRepository productRepository;


    @Override
    public Optional<Product> findBysku(String sku) {
        return productRepository.findBySku(sku);
    }

    @Override
    public void deleteBysku(String sku) {
        productRepository.deleteBySku(sku);
    }
}
