package com.inventory.Inventrack.domain.dto;


import com.inventory.Inventrack.domain.entity.Category;
import java.time.LocalDateTime;

public class ProductRequestDTO {
    private String sku;
    private String name;
    private Category category;
    private Double price;
    private Integer stock_quantity;
}
