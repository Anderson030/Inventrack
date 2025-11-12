package com.inventory.Inventrack.domain.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "products")
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String sku;
    private String name;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;
    private Double price;
    private Integer stock_quantity;
    private boolean stock_available;
    private LocalDateTime created_at;
}
