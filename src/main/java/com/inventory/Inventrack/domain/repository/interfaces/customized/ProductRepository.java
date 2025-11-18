package com.inventory.Inventrack.domain.repository.interfaces.customized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.repository.interfaces.GenericRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    Optional<Product> findBySku(String sku);
    void deleteBySku(String sku);
}
