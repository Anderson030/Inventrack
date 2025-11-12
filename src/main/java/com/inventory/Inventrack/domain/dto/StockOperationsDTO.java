package com.inventory.Inventrack.domain.dto;



import java.time.LocalDateTime;

public class StockOperationsDTO {
    private Long id;
    private Long productId;
    private String operationType;
    private Integer quantity;
    private String reason;
    private LocalDateTime operationDate;

    public StockOperationsDTO() {}

    public StockOperationsDTO(Long id, Long productId, String operationType, Integer quantity, String reason, LocalDateTime operationDate) {
        this.id = id;
        this.productId = productId;
        this.operationType = operationType;
        this.quantity = quantity;
        this.reason = reason;
        this.operationDate = operationDate;
    }


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public Long getProductId() {
        return productId;
    }
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getOperationType() {
        return operationType;
    }
    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public Integer getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getReason() {
        return reason;
    }
    public void setReason(String reason) {
        this.reason = reason;
    }

    public LocalDateTime getOperationDate() {
        return operationDate;
    }
    public void setOperationDate(LocalDateTime operationDate) {
        this.operationDate = operationDate;
    }
}

