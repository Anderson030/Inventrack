package com.inventory.Inventrack.domain.dto;

import com.inventory.Inventrack.domain.entity.Product;

import java.time.LocalDateTime;

public class StockOperationsResponseDTO {
    private Long id;
    private Product product;
    private String operation_type;
    private Integer quantity;
    private String reason;
    private LocalDateTime operation_date;
}
