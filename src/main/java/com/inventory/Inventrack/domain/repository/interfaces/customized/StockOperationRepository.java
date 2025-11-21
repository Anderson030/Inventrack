package com.inventory.Inventrack.domain.repository.interfaces.customized;

import com.inventory.Inventrack.domain.entity.StockOperation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockOperationRepository extends JpaRepository<StockOperation, Long> {
}
