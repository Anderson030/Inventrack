package com.inventory.Inventrack.domain.dto;

import java.time.LocalDateTime;

public class PurchaseDTO {
    private Long id;
    private String dealer;
    private Double totalCost;
    private LocalDateTime createdAt;

    public PurchaseDTO() {}

    public PurchaseDTO(Long id, String dealer, Double totalCost, LocalDateTime createdAt) {
        this.id = id;
        this.dealer = dealer;
        this.totalCost = totalCost;
        this.createdAt = createdAt;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getDealer() {
        return dealer;
    }
    public void setDealer(String dealer) {
        this.dealer = dealer;
    }

    public Double getTotalCost() {
        return totalCost;
    }
    public void setTotalCost(Double totalCost) {
        this.totalCost = totalCost;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }
    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}

