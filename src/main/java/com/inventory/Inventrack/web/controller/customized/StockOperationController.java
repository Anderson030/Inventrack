package com.inventory.Inventrack.web.controller.customized;

import com.inventory.Inventrack.domain.entity.StockOperation;
import com.inventory.Inventrack.domain.service.interfaces.GenericService;
import com.inventory.Inventrack.web.controller.ControllerGeneric;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stockOperation")
public class StockOperationController extends ControllerGeneric<StockOperation, Long> {
    public StockOperationController(GenericService<StockOperation, Long> genericService) {
        super(genericService);
    }
}
