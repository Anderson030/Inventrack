//package com.inventory.Inventrack.domain.service.impl.customized;
//
//import com.inventory.Inventrack.domain.entity.Product;
//import com.inventory.Inventrack.domain.repository.interfaces.GenericRepository;
//import com.inventory.Inventrack.domain.repository.interfaces.customized.ProductRepository;
//import com.inventory.Inventrack.domain.service.impl.ServiceGenericImpl;
//import com.inventory.Inventrack.domain.service.interfaces.customized.ProductService;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.Optional;
//
//@Service
//@Transactional
//public class ProductServiceImpl extends ServiceGenericImpl<Product, Long> implements ProductService {
//
//    private final ProductRepository productRepository;
//
//    public ProductServiceImpl(GenericRepository<Product, Long> repository, ProductRepository productRepository) {
//        super(repository);
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public Optional<Product> findBySku(String sku) {
//        return productRepository.findBySku(sku);
//    }
//
//    @Override
//    public void deleteBySku(String sku) {
//        productRepository.deleteBySku(sku);
//    }
//}
