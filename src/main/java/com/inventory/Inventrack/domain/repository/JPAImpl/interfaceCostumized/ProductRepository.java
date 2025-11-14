package com.inventory.Inventrack.domain.repository.JPAImpl.interfaceCostumized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.repository.JPAImpl.JPARepositoryGenericImpl;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface
ProductRepository extends JPARepositoryGenericImpl.Repository<Product, Long> {

    Optional<Product> findBySku(String sku);
    void deleteBySku(String sku);
}
