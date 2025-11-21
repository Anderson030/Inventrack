package com.inventory.Inventrack.domain.service.impl.customized;

import com.inventory.Inventrack.domain.entity.Purchase;
import com.inventory.Inventrack.domain.repository.interfaces.customized.PurchaseRepository;
import com.inventory.Inventrack.domain.service.impl.ServiceGenericImpl;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class PurchaseServiceImpl extends ServiceGenericImpl<Purchase, Long> {

    public PurchaseServiceImpl(PurchaseRepository purchaseRepository){
        super(purchaseRepository);
    }
}
