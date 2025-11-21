package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.entity.Purchase;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/purchase")
public class PurchaseController extends ControllerGeneric<Purchase, Long> {
    public PurchaseController(GenericService<Purchase, Long> genericService) {
        super(genericService);
    }
}
