package com.inventory.Inventrack.domain.repo;

import com.inventory.Inventrack.domain.entity.StockOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOperationRepo extends JpaRepository<StockOperation, Long> {
}
