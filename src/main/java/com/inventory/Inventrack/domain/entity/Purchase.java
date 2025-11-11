package com.inventory.Inventrack.domain.entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "purchases")
public class Purchase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String dealer;
    private Double total_cost;
    private LocalDateTime created_at;

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

    public Double getTotal_cost() {
        return total_cost;
    }
    public void setTotal_cost(Double total_cost) {
        this.total_cost = total_cost;
    }

    public LocalDateTime getCreated_at() {
        return created_at;
    }
    public void setCreated_at(LocalDateTime created_at) {
        this.created_at = created_at;
    }
}
