package com.inventory.Inventrack.domain.dto;

import com.inventory.Inventrack.domain.entity.Product;

public class StockOperationRequestDTO {
    private Product product;
    private String operation_type;
    private Integer quantity;
    private String reason;
}
