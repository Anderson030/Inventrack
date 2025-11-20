package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.entity.Product;
import com.inventory.Inventrack.domain.service.interfaces.customized.ProductService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/product")
public class ProductController extends ControllerGeneric<Product, Long> {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        super(productService);
        this.productService = productService;
    }
    @GetMapping("sku/{sku}")
    public Optional<Product> findBySku(@PathVariable String sku){
        return productService.findBySku(sku);
    }
    @DeleteMapping("sku/{sku}")
    public void deleteBySku(@PathVariable String sku){
        productService.deleteBySku(sku);
    }
}
