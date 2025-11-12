package com.inventory.Inventrack.domain.dto;

import java.time.LocalDateTime;

public class ProductDTO {
    private Long id;
    private String sku;
    private String name;
    private Long categoryId;
    private Double price;
    private Integer stockQuantity;
    private boolean stockAvailable;
    private LocalDateTime createdAt;

    public ProductDTO() {}

    public ProductDTO(Long id, String sku, String name, Long categoryId, Double price,
                      Integer stockQuantity, boolean stockAvailable, LocalDateTime createdAt) {
        this.id = id;
        this.sku = sku;
        this.name = name;
        this.categoryId = categoryId;
        this.price = price;
        this.stockQuantity = stockQuantity;
        this.stockAvailable = stockAvailable;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getSku() {
        return sku;
    }
    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Long getCategoryId() {
        return categoryId;
    }
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStockQuantity() {
        return stockQuantity;
    }
    public void setStockQuantity(Integer stockQuantity) {
        this.stockQuantity = stockQuantity;
    }

    public boolean isStockAvailable() {
        return stockAvailable;
    }
    public void setStockAvailable(boolean stockAvailable) {
        this.stockAvailable = stockAvailable;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

