package com.inventory.Inventrack.domain.repo.implementRepository;

import com.inventory.Inventrack.domain.entity.Product;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ProductRepositoryExtendsAbstractCustomized extends AbstractGenericImplementRepository.Repository<Product, Long> {

    Optional<Product> findBySku(String sku);
    void deleteBySku(String sku);
}
