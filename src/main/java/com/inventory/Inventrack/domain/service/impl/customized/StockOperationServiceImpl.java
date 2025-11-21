package com.inventory.Inventrack.domain.service.impl.customized;

import com.inventory.Inventrack.domain.entity.StockOperation;
import com.inventory.Inventrack.domain.repository.interfaces.customized.StockOperationRepository;
import com.inventory.Inventrack.domain.service.impl.ServiceGenericImpl;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StockOperationServiceImpl extends ServiceGenericImpl<StockOperation, Long> {

    public StockOperationServiceImpl(StockOperationRepository stockOperationRepository){
        super(stockOperationRepository);
    }
}
